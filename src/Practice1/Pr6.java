package Practice1;
import java.util.Scanner;

public class Pr6 {
    public static void runTask() {
        Scanner in = new Scanner(System.in);
        int s = 0, s_50=5, s_100 = 2, s_1000 = 3;
        try {
            System.out.println("Введите денежную сумму (s >= 0)");
            s = in.nextInt();
        } catch (Exception e) {
            System.out.print("Ошибка!Неверные данные");
        }
        int clone_s=s, cnt50=0, cnt100=0, cnt1000=0;
        if(s == 0){
            System.out.print("Банкомат не может выдать нулевую сумму");
            System.exit(1);
        }

        if(s < 0){
            System.out.print("Банкомат не может выдать отрицательную сумму");
            System.exit(1);
        }
        for(;s / 1000 != 0 && s_1000 != 0; s-= 1000, s_1000--, cnt1000++) {
            ;
        }
        for(;s / 100 != 0 && s_100 != 0; s-= 100, s_100--, cnt100++) {
            ;
        }
        for(;s / 50 != 0 && s_50 != 0; s-= 50, s_50--, cnt50++) {
            ;
        }
        if(s == 0)
            System.out.printf("Успешно! Вам будет выдана сумма: %d максимально крупными купюрами:\n" +
                    "50: %d\n" +
                    "100: %d\n"+
                    "1000: %d\n", clone_s, cnt50, cnt100, cnt1000);
        else
            System.out.printf("Неуспешно!Ошибка не хватило купюр, возможно выдать только: %d следующими купюрами:\n" +
                    "50: %d\n" +
                    "100: %d\n"+
                    "1000: %d\n", clone_s-s, cnt50, cnt100, cnt1000);
    }
}
