package IndividualPractice.Input;

import java.io.*;
import java.util.Scanner;

public class Input {
    public static int[][] readInputMatrix(String filename) throws FileNotFoundException {
        BufferedReader file = null;
        String line = null;
        int cnt = 0, size = -1;
        String[] newLine = null;
        int[][] matrix = new int[0][0];
        try {
            file = new BufferedReader(new FileReader(filename));
            line = file.readLine();
            if (line == null) { //файл пуст
                System.err.println("Файл пуст!");
                System.exit(1);
            }
            while (line != null) { //чтение размера
                if (!line.isEmpty()) {
                    String lineS = line.replaceAll("[\\s]", "");
                    if ('0' == lineS.charAt(0) && lineS.length() != 1) {
                        System.err.println("Количество вершин не было указано в файле!");
                        System.exit(1);
                    }
                    size = Integer.parseInt(String.valueOf(lineS));
                    break;
                }
                line = file.readLine();
            }
            if (size <= 0) {
                System.err.println("Количество вершин не может быть нулевыем или отрицательным");
                System.exit(1);
            }
            matrix = new int[size][size];
            int j = 0, i = 0;
            while ((line = file.readLine()) != null) {
                if (line.isEmpty())
                    continue;
                String lineS = line.replaceAll("[\\s]", "");
                newLine = lineS.split("");
                cnt = 0;
                for (j = 0; j < size; j++, cnt++) {
                    matrix[i][j] = Integer.parseInt(newLine[j]);
                    System.out.printf("%d", matrix[i][j]);
                }
                i++;
                System.out.println();
            }
            if (i != size) {
                System.err.println("Не хватает строк(и) для заполнения матрицы");
                System.err.printf("Ожидалось - %d, в файле имеется - %d", cnt, i);
                System.exit(1);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка!Такого файла не существует");
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (NumberFormatException e) {
            System.err.println("Вводите матрицу нормально без лишних символов и отрицательных элементов!Фатальная ошибка");
            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("В столбце не хватает информации для заполнения матрицы!");
            System.exit(1);
        }
        return matrix;
    }
}