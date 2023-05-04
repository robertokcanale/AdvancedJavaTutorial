package Chapter4.Streams;

import java.util.ArrayList;

//Streams are better for internal looping operations
//Allow to perform things inside the stream, searching filtering etc. and are in general Much Faster!
//Allows to use ITERATIONS in PARALLEL, this is easy and it is faster. For small datasets, there is no difference
// .stream()= normal stream
// .parallelStream()= parallel stream
public class Library {
    public static void main(String[] args){
        ArrayList<Book> books = populateLibrary();

        //Turn the books array into a STREAM
        //Check if AuthorStarts with J
        books.parallelStream().filter(book -> book.getAuthor().startsWith("J")).forEach(System.out::println); //Lambda function of println

        //ADD More Filtering, where the list starts with A and the book with another letter
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("A");
        }).filter(book-> {
            return book.getTitle().startsWith("C");
        }).forEach(System.out::println); //Lambda function of println
    }

    private static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("Alice Walker", "The Colour 1"));
        books.add(new Book("Alice 2415", "Colour 1"));
        books.add(new Book("Alice Walker", "The Colour 2"));
        books.add(new Book("Alice Walker", "Colour 3"));
        books.add(new Book("Alice Walker", "The Colour 4"));
        books.add(new Book("Jeez Luise", "Strange Name Book"));
        books.add(new Book("Alice Kimbell", "The Colour 100"));
        return books;
    }
}
