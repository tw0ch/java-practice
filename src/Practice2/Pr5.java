package Practice2;

import java.util.Scanner;

public class Pr5 {
    public static void runTask() {
        Scanner scanner = new Scanner(System.in);
        int i = 0, j = 0, a = 0, length = 8;
        int[][] matrix = new int[length][length];
        try {
            for (i = 0; i < length; i++) {
                for (j = 0; j < length; j++) {
                    a = scanner.nextInt();
                    if (a < -10 || a > 10) {
                        System.out.println("Ошибка! Числа могут вводиться только в диапазоне от -10 до 10 включительно");
                        System.exit(1);
                    }
                    matrix[i][j] = a;
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода!В матрицу можно вводить только целочисленные числа");
            System.exit(1);
        }
        int cnt = 0;
        for (i = 1; i < length - 1; i++) {
            for (j = 1; j < length - 1; j++) {
                if (matrix[i][j] < matrix[i][j - 1] && matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i - 1][j] && matrix[i][j] < matrix[i][j + 1])
                    cnt++;
            }
        }
        System.out.printf("Количество локальных минимумов в заданной матрице - %d", cnt);
    }
}
