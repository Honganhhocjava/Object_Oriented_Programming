package hus.oop.lab4;

// 2.2 (Advanced) The Author and Book Classes Again - An Array
//of Objects as an Instance Variable
public class Book22 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    // Constructors
    public Book22(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book22(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String result = "Book[name = " + name + ", authors = ";

        for (int i = 0; i < authors.length; i++) {
            result += authors[i].getName();

            if (i < authors.length - 1) {
                result += ", ";
            }
        }

        result += ", price = " + price + ", qty = " + qty + "]";

        return result;
    }

    public String getAuthorNames(){
        String authorNames = "";

        for (int i = 0; i < authors.length; i++) {
            authorNames += authors[i].getName();

            if (i < authors.length - 1) {
                authorNames += ", ";
            }
        }

        return authorNames;
    }

}

