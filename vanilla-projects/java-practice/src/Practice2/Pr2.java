package Practice2;

import java.util.Arrays;

import java.util.Scanner;

public class Pr2 {
    public static void runTask() {
        int elemMas = 0;


        int mass[] = new int[20];
        int max = mass[0];
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
            if (mass[i] % 2 == 0 && mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println("Максимальный чётный элемент");
        System.out.println(max);
    }
}
