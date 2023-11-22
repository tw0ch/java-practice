package Practice1;
import java.util.Scanner;

public class Pr1 {
    public static void runTask() {
        Scanner years = new Scanner(System.in);
        int year = 0;
        try {
            System.out.println("Введите год: ");
            year = years.nextInt();
        }catch(Exception e) {
            System.out.println("Неверный ввод");
        }
        if (year < 0) {
            System.out.println("Неверный ввод");
        }
        int mod = year % 12;
        switch (mod) {
            case 0 -> System.out.println("Год обезьяны");
            case 1 -> System.out.println("Год курицы");
            case 2 -> System.out.println("Год собаки");
            case 3 -> System.out.println("Год свиньи");
            case 4 -> System.out.println("Год крысы");
            case 5 -> System.out.println("Год коровы");
            case 6 -> System.out.println("Год тигра");
            case 7 -> System.out.println("Год зайца");
            case 8 -> System.out.println("Год дракона");
            case 9 -> System.out.println("Год змеи");
            case 10 -> System.out.println("Год лошади");
            case 11 -> System.out.println("Год овцы");
        }

    }
}
