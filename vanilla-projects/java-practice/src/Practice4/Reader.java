package Practice4;

public class Reader {
    private String name;
    private Book book;

    Reader() {

    }

    Reader(String name, Book book) {
        setName(name);
        setBook(book);
    }

    public Reader(Reader reader) {
        this.name = reader.name;
        this.book = reader.book;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public String statistics(int day, int month) {
        if (month > book.getMonthBookReturned() || month == book.getMonthBookReturned() && day >= book.getDayBookTook()) {
            return book.getAuthorBook() + " " + book.getNameBook() + " " + this.name + " Сдана не в срок";
        } else
            return book.getAuthorBook() + " " + book.getNameBook() + " " + this.name + " Сдана  в срок";
    }
}