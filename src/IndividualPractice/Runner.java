package IndividualPractice;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void runPractice() {
        try {
            ArrayList<ArrayList<Integer>> obj = InputWorker.readInputMatrix();
            System.out.println(Arrays.toString(new ArrayList[]{obj}));
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        }
    }
}
