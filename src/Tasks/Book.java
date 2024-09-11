package Tasks;

public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void changePrice(double newPrice) {
        price = newPrice;

    }

    public void getDisplay() {
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("example title", "example author", 9);
        book1.getDisplay();

        book1.changePrice(13);
        book1.getDisplay();
    }


}

