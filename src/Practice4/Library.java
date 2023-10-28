package Practice4;

public class Library {
    public static void runTask() {
        Book bookFirst = new Book("Java 8. Полное руководство", "Г.Шилдта", 1, 4);
        Book bookSecond = new Book("Крейцерова соната", "Л.Толстой", 25, 3);
        Reader readerFirst = new Reader("Петров", "Java 8. Полное руководство");
        Reader readerSecond = new Reader("Васечкин", "Крейцерова соната");
        System.out.println(readerFirst.statistics(bookFirst, readerFirst, 29, 3));
        System.out.println(readerSecond.statistics(bookSecond, readerSecond, 29, 3));
    }
}