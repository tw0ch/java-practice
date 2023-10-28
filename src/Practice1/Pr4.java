package Practice1;
import java.util.Scanner;

public class Pr4 {
    public static void runTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите N - количество этажей в доме(Натуральное число)");
        int N=0, M=0;

        try {
            N = in.nextInt();
            System.out.println("Введите M - номер квартиры(Натуральное число) ");
            M = in.nextInt();
        } catch(Exception e) {
            System.out.println("Ошибка данных!");
            System.exit(1);
        }

        if (N <= 0 | M <= 0) {
            System.out.println("Неверные данные! Просили же N и M натуральными!!");
            System.exit(1);
        }
        if (M > N * 3) {
            System.out.println("Такой квартиры не существует в доме!");
            System.exit(1);
        }
        float count_M = M / 3;
        int floor;
        if (M % 3 != 0)
            count_M += 1;
        floor = Math.round(count_M);
        if(floor % 2 != 0)
            System.out.printf("%d", floor);
        else
            System.out.println("Лифт может останавливаться только на нечётном этаже");
    }
}

