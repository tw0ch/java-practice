package Practice2;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Pr7 {
    public static void runTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество игроков для партии в покер(Не более 10)");
        int N = 0;
        String[] card = {"Ч2", "Ч3", "Ч4", "Ч5", "Ч6", "Ч7", "Ч8", "Ч9", "Ч10", "ЧВ", "ЧД", "ЧК", "ЧТ",
                "П2", "П3", "П4", "П5", "П6", "П7", "П8", "П9", "П10", "ПВ", "ПД", "ПК", "ПТ",
                "К2", "К3", "К4", "К5", "К6", "К7", "К8", "К9", "К10", "КВ", "КД", "КК", "КТ",
                "Б2", "Б3", "Б4", "Б5", "Б6", "Б7", "Б8", "Б9", "Б10", "БВ", "БД", "БК", "БТ",};
        try {
            N = scanner.nextInt();
            if (N >= 11 || N <= 0) {
                System.out.println("Количество игроков не должно превышать 10 и не может быть <= 0");
                System.exit(1);

            }
        } catch (Exception e) {
            System.out.println("Ошибка!!");
            System.exit(1);
        }
        Random r = new Random();
        int b = 0, a = 0;
        String tmp;
        for (int i = 0; i < 52 * 10; i++) {
            a = r.nextInt(card.length);
            b = r.nextInt(card.length);
            tmp = card[a];
            card[a] = card[b];
            card[b] = tmp;
        }
        System.out.println(Arrays.toString(card)); // Метод Arrays.toString выводит на экран массив, в случае двумерного deepToString(card)
        int cnt = 0;
        for (int i = 0; i < N * 5; i++) {
            if (i % 5 == 0) {
                cnt++;
                System.out.printf("Игроку %d будет выдан следующий набор карт: ", cnt);
                System.out.println();
            }
            System.out.print(card[i]);
            System.out.print(" ");
            System.out.println();
        }
    }

}

