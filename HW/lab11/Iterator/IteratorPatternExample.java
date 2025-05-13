package hus.oop.lab11.Iterator;

public class IteratorPatternExample {
    public static void main(String[] args) {
        // Các tên sản phẩm mẫu
        String[] products = {"Sản phẩm 1", "Sản phẩm 2", "Sản phẩm 3"};

        // Tạo một Productcatalog với các sản phẩm mẫu
        Productcatalog productCatalog = new Productcatalog(products);

        // Lấy iterator từ Productcatalog
        Iterator iterator = productCatalog.getIterator();

        // Lặp qua các sản phẩm
        while (iterator.hasNext()) {
            String productName = (String) iterator.next();
            System.out.println("Sản phẩm: " + productName);
        }
    }
}
