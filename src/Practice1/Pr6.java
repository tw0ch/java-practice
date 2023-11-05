package Practice1;

import java.util.Scanner;

public class Pr6 {
    public static void runTask() {
        Scanner in = new Scanner(System.in);
        int s = 0, s50 = 5, s100 = 2, s1000 = 3;
        try {
            System.out.println("Введите денежную сумму (s >= 0)");
            s = in.nextInt();
        } catch (Exception e) {
            System.out.print("Ошибка!Неверные данные");
        }
        int cloneS = s, cnt50 = 0, cnt100 = 0, cnt1000 = 0;
        if (s == 0) {
            System.out.print("Банкомат не может выдать нулевую сумму");
            System.exit(1);
        }

        if (s < 0) {
            System.out.print("Банкомат не может выдать отрицательную сумму");
            System.exit(1);
        }

        for (; s / 1000 != 0 && s1000 != 0; s -= 1000, s1000--, cnt1000++) {
        }

        for (; s / 100 != 0 && s100 != 0; s -= 100, s100--, cnt100++) {
        }

        for (; s / 50 != 0 && s50 != 0; s -= 50, s50--, cnt50++) {
        }

        if (s == 0)
            System.out.printf("Успешно! Вам будет выдана сумма: %d максимально крупными купюрами:\n" +
                    "50: %d\n" +
                    "100: %d\n" +
                    "1000: %d\n", cloneS, cnt50, cnt100, cnt1000);
        else
            System.out.printf("Неуспешно!Ошибка не хватило купюр, возможно выдать только: %d следующими купюрами:\n" +
                    "50: %d\n" +
                    "100: %d\n" +
                    "1000: %d\n", cloneS - s, cnt50, cnt100, cnt1000);
    }
}
