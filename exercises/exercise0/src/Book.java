import java.util.Date;

public class Book {
    String title;
    String author;
    String publisher;
    int numOfPages;
    String type;
    double price;
    Date publishDate;
    String translator;

    public Book(String title) {
        this.title = title;
        System.out.println("Creating a book, title: " + this.title);
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }
}
