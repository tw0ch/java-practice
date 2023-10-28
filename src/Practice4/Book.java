package Practice4;

public class Book {
    private String nameBook;
    private String authorBook;
    private int dayBookTook;
    private int monthBookReturned;

    public Book() {

    }

    public Book(String nameBook, String authorBook, int dayBookTook, int monthBookReturned) {
        SetNameBook(nameBook);
        SetAuthorBook(authorBook);
        SetDayBookTook(dayBookTook);
        SetMonthBookReturned(monthBookReturned);
    }

    public Book(Book lib) {
        this.nameBook = lib.nameBook;
        this.authorBook = lib.authorBook;
        this.dayBookTook = lib.dayBookTook;
        this.monthBookReturned = lib.monthBookReturned;
    }

    public void SetNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void SetAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public void SetDayBookTook(int dayBookTook) {
        this.dayBookTook = dayBookTook;
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
        return dayBookTook;
    }

    public int getMonthBookReturned() {
        return monthBookReturned;
    }
}

