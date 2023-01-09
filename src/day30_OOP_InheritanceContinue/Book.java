package day30_OOP_InheritanceContinue;

public class Book {

    private String title, type, author;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price == 0){

            System.err.println("Price can not be zero!!!");
            System.exit(1);

        }

        this.price = price;

    }

    public Book(String title, String type, String author, double price){

        this.title = title;
        this.author = author;
        this.type = type;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Paper{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
