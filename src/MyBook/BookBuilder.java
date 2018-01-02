package MyBook;

public class BookBuilder {



        private String title;
        private float price;      // this has a default
        private String type; // most students don't have one

        public BookBuilder() { }

        public Book buildStudent()
        {
            return new Book(title, price, type);
        }

        public BookBuilder setTitle(String title)
        {
            this.title = title;
            return this;
        }

        public BookBuilder setPrice(float price)
        {
            this.price = price;
            return this;
        }

        public BookBuilder setType(String type)
        {
            this.type = type;
            return this;
        }

}
