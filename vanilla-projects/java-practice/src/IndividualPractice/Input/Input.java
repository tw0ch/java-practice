package IndividualPractice.Input;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Input {
    public static int[][] readInputMatrix() throws FileNotFoundException {
        try {
            // create File and Scanner objects
            String path = "/Users/egorm/GitRepos/java-practice/src/IndividualPractice/Input/adjacency_matrix.txt";
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            // read number of vertices
            int n = scanner.nextInt();

            // create 2D array
            int[][] adjMatrix = new int[n][n];

            // read adjacency matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (scanner.hasNextInt()) {
                        adjMatrix[i][j] = scanner.nextInt();
                    }
                }
            }
            // close Scanner object
            scanner.close();
            return adjMatrix;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}