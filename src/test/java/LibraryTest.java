import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library(20);
        book = new Book("something", "somebody", "scifi");
    };

    @Test
    public void canGetNumberOfBooks(){
    assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void canAddBooks(){
        library.addBooks(book);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void cannotAddBooksWhenIfFull(){
        Library newLibrary = new Library(1);
        newLibrary.addBooks(book);
        newLibrary.addBooks(book);
        assertEquals(1, newLibrary.getNumberOfBooks());

    }

    @Test
    public void canRemoveBooks(){
        library.addBooks(book);
        library.addBooks(book);
        library.addBooks(book);
        library.removeBook();
        assertEquals(2, library.getNumberOfBooks());

    }
}
