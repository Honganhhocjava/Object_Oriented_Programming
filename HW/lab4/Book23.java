package hus.oop.lab4;
public class Book23 {
    private String isbn;
    private String name;
    private Author23 author;
    private double price;
    private int qty;

    public Book23(String isbn, String name, Author23 author, double price){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public Book23(String isbn, String name, Author23 author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getISBN() {
        return this.isbn;
    }

    public String getName() {
        return this.name;
    }

    public Author23 getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        return author.getName();
    }

    @Override
    public String toString(){
        return "Book[isbn = " + this.isbn + ", name = "
                + this.name + author + ", price = " + this.price + ", qty = " + this.qty + "]";
    }
}
