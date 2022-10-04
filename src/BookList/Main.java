package BookList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add( new Book("Hayvan Çiftliği", 152, "George Orwell", 1945));
        bookList.add( new Book("Robotların Yükselişi", 336, "Martin Ford", 2015));
        bookList.add( new Book("Toyota Ruhu", 203, "Taiichi Ohno", 1996));
        bookList.add( new Book("Zamanın Kısa Tarihi", 255, "Stephen Hawking", 1988));
        bookList.add( new Book("Kozmos", 398, "Carl Sagan", 2016));
        bookList.add( new Book("Zamanın Kısa Tarihi", 255, "Stephen Hawking", 1988));
        bookList.add( new Book("Türlerin Kökeni", 472, "Charles Darwin", 1859));
        bookList.add( new Book("Bilimin Büyüsü", 160, "Celal Şengör", 2019));
        bookList.add( new Book("İzafiyet Teorisi", 280, "Albert Einstein", 1916));
        bookList.add( new Book("On Kişiydiler", 244, "Agatha Christie", 1939));
        bookList.add(new Book("Yılkı Atı", 95, "Peyami Safa", 1977));


        Map<String, String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getBookName(), book.getAuthor()));
        for (String i : bookMap.keySet()) {
            System.out.println("Kitap Adı : " + i + "\nYazar : " + bookMap.get(i));
            System.out.println("------------------------------------");
        }

        System.out.println("******************************************************************");

        System.out.println("Sayfa Sayısı 100'den Fazla Olan Kitaplar :");

        // FILTER
        List<Book> filterBooks = bookList.stream().filter(book -> book.getNumberOfPages() > 100).collect(Collectors.toList());
        filterBooks.stream().forEach(book -> System.out.println("Kitap Adı : " + book.getBookName() +
                " - Sayfa Sayısı : " + book.getNumberOfPages()+
                " - Yazarı : " + book.getAuthor()+
                " - Yayın Tarihi : " + book.getReleaseDate()));


        System.out.println("******************************************************************");

        System.out.println("Sayfa Sayısı 100'den Az Olan Kitaplar :");

        // FILTER (Less Than 100 Pages)
        List<Book> lessThan100Pages = bookList.stream().filter(book -> book.getNumberOfPages() < 100).collect(Collectors.toList());
        lessThan100Pages.stream().forEach(book -> System.out.println("Kitap Adı : " + book.getBookName() +
                " - Sayfa Sayısı : " + book.getNumberOfPages()+
                " - Yazarı : " + book.getAuthor()+
                " - Yayın Tarihi : " + book.getReleaseDate()));
    }
}
