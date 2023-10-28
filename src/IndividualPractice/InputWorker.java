package IndividualPractice;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class InputWorker {
    public static ArrayList<ArrayList<Integer>> readInputMatrix() throws FileNotFoundException {
        String path = "C:\\Users\\egorm\\GitHub\\java-practice\\src\\IndividualPractice\\adjacency_matrix.txt";
        Scanner scanner = new Scanner(new File(path));

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

        int n = Integer.parseInt(scanner.next());

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        return matrix;
    }
}
