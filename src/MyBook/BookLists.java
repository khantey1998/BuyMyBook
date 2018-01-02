
package MyBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookLists {
    List<Book> bookLists;

    public BookLists() {
        bookLists  = new ArrayList<>();
        bookLists.add(new Book("srey laor", 20.0f,"education"));
    }

    void addBook(Book newBook){
        bookLists.add(newBook);
    }
    public void showTitle(){
        for (Book book:bookLists){
            System.out.println("Title:"+book.getTitle()+", Price:"+book.getPrice()+", Type:"+book.getType());

        }
    }
}
