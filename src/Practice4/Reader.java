package Practice4;

public class Reader {
    private String name;
    private String book;

    Reader() {

    }

    Reader(String name, String book) {
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

    public void setBook(String book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public String getBook() {
        return book;
    }

    public String statistics(Book book, Reader reader, int day, int month) {
        if (month > book.getMonthBookReturned() || month == book.getMonthBookReturned() && day >= book.getDayBookTook()) {
            return book.getAuthorBook() + " " + book.getNameBook() + " " + reader.getName() + " Сдана не в срок";
        } else
            return book.getAuthorBook() + " " + book.getNameBook() + " " + reader.getName() + " Сдана  в срок";
    }
}