package IndividualPractice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class Dijkstra {
    public static Graph algorithm(Graph initial_graph, Node source_node) {

        Graph graph = setInitialDistance(initial_graph, source_node);

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();
        unsettledNodes.add(source_node);

        while (unsettledNodes.size() != 0) {
            Node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Entry<Node, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                Integer edgeWeigh = adjacencyPair.getValue();

                Node adjacentNode = null;
                for (Node node : graph.getNodes()) {
                    if (node.getNodeNumber() == adjacencyPair.getKey().getNodeNumber()) {
                        adjacentNode = node;
                        break;
                    }
                }

                if (!settledNodes.contains(adjacentNode) && adjacentNode != null) {
                    CalculateMinimumDistance(adjacentNode, edgeWeigh, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return new Graph(graph.getNodes());
    }

    private static Graph setInitialDistance(Graph graph, Node source) {
        for (Node node : graph.getNodes()) {
            if (node.getNodeNumber() != source.getNodeNumber()) {
                node.setDistance(Integer.MAX_VALUE);
            } else {
                node.setDistance(0);
            }
        }
        return graph;
    }

    private static Node getLowestDistanceNode(Set<Node> unsettledNodes) {
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node : unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void CalculateMinimumDistance(Node evaluationNode, Integer edgeWeigh, Node sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }
}
