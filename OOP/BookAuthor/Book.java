package OOP.BookAuthor;

public class Book {
    private final String name;
    private double price;
    private final Author[] authors;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }
    public Book(String name, Author[] author, double price, int qty) {
        this(name, author, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author=" + authors +
                ", qty=" + qty +
                '}';
    }
}
