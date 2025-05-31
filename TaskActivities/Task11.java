package TaskActivities;

public class Task11 {
    public static void main(String[] args) {
        Book javaBook = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book pythonBook = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book cppBook = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

        System.out.println("Book 1:\n" + javaBook);
        System.out.println("\nBook 2:\n" + pythonBook);
        System.out.println("\nBook 3:\n" + cppBook);
    }
}

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
return "Title: \"" + title + "\"\n" +
       "Author: \"" + author + "\"\n" +
       "Year Published: " + yearPublished + "\n" +
       "Price: $" + String.format("%.2f", price);

    }
}


