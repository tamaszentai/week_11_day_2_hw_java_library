import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower();
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canBorrowBooks(Library library){
        library.addBooks(book);
        library.addBooks(book);
        library.addBooks(book);
        library.removeBook();
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
        assertEquals(2, library.getNumberOfBooks());
    }



}
