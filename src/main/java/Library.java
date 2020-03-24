import java.util.ArrayList;

public class Library {

    private ArrayList<Book> listofbooks;
    private int capacity;

    public Library(int capacity){
        this.listofbooks = new ArrayList<Book>();
        this.capacity = capacity;

    }


    public int getNumberOfBooks() {
        return this.listofbooks.size();
    }

    public void addBooks(Book book) {
        if (hasRoom()) {
            this.listofbooks.add(book);
        }
    }

    public boolean hasRoom(){
        return this.capacity > getNumberOfBooks();
    }


    public void removeBook() {
        this.listofbooks.remove(0);
    }
}
