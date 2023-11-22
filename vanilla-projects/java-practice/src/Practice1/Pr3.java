package Practice1;

public class Pr3 {
    public static void runTask() {
        int tableWidth = 1 + 1 + 1 + 40 + 1 + 30 + 1;
        String format = "|%1s|%-40s|%30s|\n";

        System.out.println("-".repeat(tableWidth));

        System.out.format(format, centerString(1, "№"), centerString(40, "Ключ"), centerString(30, "Количество переходов"));

        System.out.println("-".repeat(tableWidth));

        System.out.format(format, "1", "Купить квартиру недорого", "225 406");
        System.out.format(format, "2", "Купить квартиру в Ярославле", "137 489");
        System.out.format(format, "3", "Купить квартиру без посредников", "87 478");

        System.out.println("-".repeat(tableWidth));
    }

    private static String centerString(int width, String s) {
        return String.format("%-" + width + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
    }
}
