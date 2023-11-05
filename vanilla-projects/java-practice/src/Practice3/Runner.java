package Practice3;

public class Runner {
    public static void runPractice() {
        Bus bus1 = new Bus(54, 400, 25);
        Bus bus2 = new Bus(45, 500, 30);
        if (bus1.getFareAll() > 11000)
            System.out.println("Поездка считается выгодной для автобуса 1");
        else
            System.out.println("Поездка считается невыгодной для автобуса 1");
        if (bus2.getFareAll() > 11000)
            System.out.println("Поездка считается выгодной для автобуса 2");
        else
            System.out.println("Поездка считается невыгодной для автобуса 2");
    }
}