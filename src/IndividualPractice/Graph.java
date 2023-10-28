package IndividualPractice;

import java.util.*;

public class Graph {
    private Set<Node> nodes = new HashSet<>();

    Graph(int[][] adjacencyMatrix) {
        this.nodes = getNodesFromAdjacencyMatrix(adjacencyMatrix);
    }

    Graph(Set<Node> nodes) {
        this.nodes = nodes;
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public static int numberOfArcs(Set<Node> nodes) {
        int counter = 0;
        for (Node node : nodes) {
            counter += node.adjacentNodes.size();
        }
        return counter;
    }

    public static int numberOfArcsIncludedInEachNode(Set<Node> nodes) {
        int counter = 0;
        for (Node node : nodes) {
            if (node.adjacentNodes.size() == nodes.size() - 1) {
                counter += 1;
            }
        }
        return counter;
    }

    private Set<Node> getNodesFromAdjacencyMatrix(int[][] adjacencyMatrix) {
        Set<Node> nodesFromAdjMatrix = new HashSet<>();
        for (int nodeNumber = 0; nodeNumber < adjacencyMatrix.length; nodeNumber++) {
            Node newNode = new Node(nodeNumber + 1);

            for (int adjNodenumber = 0; adjNodenumber < adjacencyMatrix.length; adjNodenumber++) {
                Node newAdjNode = new Node(adjNodenumber + 1);
                if (adjacencyMatrix[nodeNumber][adjNodenumber] != 0) {
                    newNode.addDestination(newAdjNode, adjacencyMatrix[nodeNumber][adjNodenumber]);
                }
            }
            nodesFromAdjMatrix.add(newNode);
        }
        return nodesFromAdjMatrix;
    }
}
