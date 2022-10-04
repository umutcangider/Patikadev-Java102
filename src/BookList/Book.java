package BookList;

public class Book {

    private String bookName;
    private int numberOfPages;
    private String author;
    private int releaseDate;

    public Book(String bookName, int numberOfPages, String author, int releaseDate) {
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
