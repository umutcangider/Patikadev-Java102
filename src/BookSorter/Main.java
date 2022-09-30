package BookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();

        books.add( new Book("Hayvan Çiftliği", 152, "George Orwell", 1945));
        books.add( new Book("Robotların Yükselişi", 336, "Martin Ford", 2015));
        books.add( new Book("Toyota Ruhu", 203, "Taiichi Ohno", 1996));
        books.add( new Book("Zamanın Kısa Tarihi", 255, "Stephen Hawking", 1988));
        books.add( new Book("Kozmos", 398, "Carl Sagan", 2016));

        System.out.println("================================ ADA GÖRE SIRALAMA ================================\n");
        for(Book book : books) {
            System.out.println("Kitap Adı : " + book.getBookName() +
                    " - Sayfa Sayısı : " + book.getNumberOfPages()+
                    " - Yazarı : " + book.getAuthorName()+
                    " - Yayın Tarihi : " + book.getReleaseDate());
            System.out.println("------------------------------------------------------------------------------------------");
        }
        System.out.println();

        System.out.println("================================ SAYFA SAYISINA GÖRE SIRALAMA ================================\n");

        TreeSet<Book> newBooks = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getNumberOfPages() - b2.getNumberOfPages();
            }
        });

        newBooks.add( new Book("Hayvan Çiftliği", 152, "George Orwell", 1945));
        newBooks.add( new Book("Robotların Yükselişi", 336, "Martin Ford", 2015));
        newBooks.add( new Book("Toyota Ruhu", 203, "Taiichi Ohno", 1996));
        newBooks.add( new Book("Zamanın Kısa Tarihi", 255, "Stephen Hawking", 1988));
        newBooks.add( new Book("Kozmos", 398, "Carl Sagan", 2016));


        for(Book book : newBooks) {
            System.out.println("Kitap Adı : " + book.getBookName() +
                    " - Sayfa Sayısı : " + book.getNumberOfPages()+
                    " - Yazarı : " + book.getAuthorName()+
                    " - Yayın Tarihi : " + book.getReleaseDate());
            System.out.println("------------------------------------------------------------------------------------------");
        }
    }
}
