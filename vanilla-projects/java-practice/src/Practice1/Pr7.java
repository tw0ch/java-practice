package Practice1;

import java.util.Scanner;

public class Pr7 {
    public static void runTask() {
        System.out.print("Введите первое число: ");
        int number1 = new Scanner(System.in).nextInt();

        System.out.print("Введите второе число: ");
        int number2 = new Scanner(System.in).nextInt();

        System.out.print("Введите операцию(+-*): ");
        String operation = new Scanner(System.in).nextLine();

        System.out.println(operation);

        switch (operation) {
            case ("+"):
                break;

            case ("-"):
                break;

            case ("*"):
                break;
        }


    }

//    private static int sumOperation(int num1, int num2) {
//
//    }
}
