package Iterator_Sample;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    //private int last = 0;
    private ArrayList<Book> books;
    
    public BookShelf(int maxsize) {
        this.books = new ArrayList<Book>(maxsize);
    }
    public Book getBookAt(int index) {
        return books.get(index);
    }
    public void appendBook(Book book) {
        books.add(book);
    }
    public int getLength() {
        return books.size();
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
