package MyBook;

public class Main {
    public static void main(String[] args) {
        Book srey = new BookBuilder().setTitle("Jbab srey").setType("Education").buildStudent();
        BookLists lists = new BookLists();
        lists.addBook(srey);
        lists.showTitle();
    }
}
