package MyBook;

public class Book {

    private String title;
    private String type;
    private float price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Book(String title, float price, String type) {
        this.title = title;
        this.price = price;
        this.type = type;
    }
}