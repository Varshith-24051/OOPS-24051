 class Book {

    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive!");
        }
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

class BookDetails {
    public static void main(String[] args) {

        Book myBook = new Book("To Kill a Mockingbird", "Harper Lee", 15.99);


        myBook.displayBookDetails();

        myBook.setTitle("1984");
        myBook.setAuthor("George Orwell");
        myBook.setPrice(18.99);


        System.out.println("\nUpdated Book Details:");
        myBook.displayBookDetails();


        myBook.setPrice(-5);
    }
}
