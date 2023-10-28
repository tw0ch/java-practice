package Practice2;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Pr4 {
    public static void runTask() {
        Scanner elem_mas = new Scanner(System.in);
        int mass[] = new int[20];
        ArrayList<Integer> mass_2 = new ArrayList<>();
        System.out.println("Введите 20 чисел");
        try {
            for (int i = 0; i < 20; i++) {
                mass[i] = elem_mas.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Неверный ввод");
            System.exit(1);
        }
        for (int i = 0; i < 20; i++) {
            if (mass[i] > 1000 || mass[i] < 0) {
                System.out.println("Числа слишком большие или отрицательные");
                System.exit(1);
            }
        }
        System.out.println("Вы ввели массив: ");
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < 20; i++) {
            if (mass[i] % 10 == 3) {
                mass_2.add(mass[i]);

            }
        }
        System.out.printf("Новый массив: ");
        System.out.println(mass_2);
        Collections.sort(mass_2, Collections.reverseOrder());
        System.out.print("Сортировка по убыванию: ");
        System.out.println(mass_2);


    }
}
