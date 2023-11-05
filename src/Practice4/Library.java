package Practice4;

public class Library {
    public static void runTask() {
        Book bookFirst = new Book("Java 8. Полное руководство", "Г.Шилдта", 1, 4);
        Book bookSecond = new Book("Крейцерова соната", "Л.Толстой", 25, 3);
        Reader readerFirst = new Reader("Петров", new Book("Java 8. Полное руководство", "Г. Шилдта", 1, 4));
        Reader readerSecond = new Reader("Васечкин", new Book("Крейцерова соната", "Л. Толстого", 25, 3));
        System.out.println(readerFirst.statistics(29, 3));
        System.out.println(readerSecond.statistics(29, 3));
    }
}