package Practice4;

public class Book {
    private String nameBook;
    private String authorBook;
    private int dayBookReturned;
    private int monthBookReturned;

    public Book() {
    }

    public Book(String nameBook, String authorBook, int dayBookReturned, int monthBookReturned) {
        SetNameBook(nameBook);
        SetAuthorBook(authorBook);
        SetDayBookTook(dayBookReturned);
        SetMonthBookReturned(monthBookReturned);
    }

    public Book(Book lib) {
        this.nameBook = lib.nameBook;
        this.authorBook = lib.authorBook;
        this.dayBookReturned = lib.dayBookReturned;
        this.monthBookReturned = lib.monthBookReturned;
    }

    public void SetNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void SetAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public void SetDayBookTook(int dayBookReturned) {
        this.dayBookReturned = dayBookReturned;
    }

    public void SetMonthBookReturned(int monthBookReturned) {
        this.monthBookReturned = monthBookReturned;
    }

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public int getDayBookTook() {
        return dayBookReturned;
    }

    public int getMonthBookReturned() {
        return monthBookReturned;
    }
}

