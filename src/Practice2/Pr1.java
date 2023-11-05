package Practice2;

import java.util.Arrays;

import java.util.Scanner;

public class Pr1 {
    public static void runTask() {
        int elemMas = 0;
        int sum = 0;
        int count = 0;

        int mass[] = new int[20];
        Scanner elem = new Scanner(System.in);
        System.out.println("Введите числа в диапозоне от 0 до 1000");
        try {
            for (int i = 0; i < 20; i++)
                mass[i] = elem.nextInt();
        } catch (Exception e) {
            System.out.println("Неверный ввод");
            System.exit(1);
        }
        for (int i = 0; i < 20; i++)
            if (mass[i] > 1000 || mass[i] < 0) {
                System.out.println("Числа должны быть от 0 до 1000");
                System.exit(1);
            }
        System.out.println("Вы ввели массив:");
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < 20; i++) {

            if ((mass[i] % 10) == (mass[i] / 100) && mass[i] > 99) {
                sum += mass[i];
                count++;
            }

        }
        System.out.printf("Sum: %d Count: %d", sum, count);

    }
}
