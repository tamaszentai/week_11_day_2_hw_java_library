import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowerscollection;

    public Borrower(){
        borrowerscollection = new ArrayList<Book>();

    }

    public int bookCount() {
        return this.borrowerscollection.size();
    }


    public void addBook(Book book) {
        this.borrowerscollection.add(book);
    }

}
