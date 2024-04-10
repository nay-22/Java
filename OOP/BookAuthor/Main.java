package OOP.BookAuthor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        for (Author author : authors) {
            System.out.println(author);
        }
          // Test toString()

        Book book = new Book("Java For Dummies", authors, 19.95, 99);

        // Test Getters and Setters
//        book.setPrice(29.95);
//        book.setQty(28);
//        System.out.println("name is: " + book.getName());
//        System.out.println("price is: " + book.getPrice());
//        System.out.println("qty is: " + book.getQty());
//        System.out.println("Author is: " + book.getAuthor());  // Author's toString()
//        System.out.println("Author's name is: " + book.getAuthor().getName());
//        System.out.println("Author's email is: " + book.getAuthor().getEmail());


// Use an anonymous instance of Author to construct a Book instance
//        Book anotherBook = new Book("more Java",
//                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
//        System.out.println(anotherBook);  // toString()

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()

//        System.out.println("Author is: " + book.getAuthor());  // Author's toString()
//        System.out.println("Author's name is: " + book.getAuthor().getName());
//        System.out.println("Author's email is: " + book.getAuthor().getEmail());
    }
}
