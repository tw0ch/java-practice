package Practice1;
import java.util.Scanner;

public class Pr2 {
    public static void runTask() {
        int N=0;
        System.out.println("Введите до какого числа таблица умножения");
        Scanner in = new Scanner(System.in);
        try {
            N = in.nextInt();
        }catch(Exception e){
            System.out.print("Ошибка данных!");
            System.exit(1);
        }
        if(N <= 0){
            System.out.println("Введено число <=0");
            System.exit(1);
        }
        for(int i = 1;i<=N;i++)
            System.out.printf("%4d", i);
        System.out.println();
        for(int i = 1;i<=N;i++){
            System.out.printf("%d", i);
            for(int j = 1;j<=N;j++){
                System.out.printf("%3d ", i*j);
            }
            System.out.println();
        }
    }
}
