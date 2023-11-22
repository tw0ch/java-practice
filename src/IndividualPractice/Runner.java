package IndividualPractice;

import IndividualPractice.Input.Input;

import java.io.FileNotFoundException;
import java.util.Set;

public class Runner {
    public static void runPractice() {
        try {
            int[][] inputAdjacencyMatrix = Input.readInputMatrix("/Users/egorm/GitRepos/java-practice/src/IndividualPractice/Input/adjacency_matrix.txt");

            Graph graph = new Graph(inputAdjacencyMatrix);

            Set<Node> graphNodes = graph.getNodes();

            // First task
            int numberOfArcs = graph.numberOfArcs(graphNodes);
            System.out.println("Кол-во дуг графа: " + numberOfArcs);

            // Second task
            int numberOfArcsIncludedInEachNode = graph.numberOfArcsIncludedInEachNode(graphNodes);
            System.out.println("Кол-во дуг входящих в каждую вершину графа: " + numberOfArcsIncludedInEachNode);

            // Third task
            for (Node node : graphNodes) {
                System.out.printf("Рассматриваем относительно: %d \n", node.getNodeNumber());

                Graph dijkstraResult = Dijkstra.algorithm(graph, node);

                for (Node node1 : dijkstraResult.getNodes()) {

                    int nodeDistance = node1.getDistance();
                    int nodeNumber = node1.getNodeNumber();

                    if (nodeDistance != Integer.MAX_VALUE) {
                        System.out.println(node.getNodeNumber() + " → " + nodeNumber + " " + "(" + nodeDistance + ")");
                    }
                }
            }

        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        }
    }
}
