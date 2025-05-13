package hus.oop.lab11.Iterator;

public class Productcatalog implements Iterable {
    protected ProductIterator productIterator; // Mối quan hệ "has" với ProductIterator
    protected String[] productCatalog;

    public Productcatalog(String[] productCatalog) {
        this.productCatalog = productCatalog;
        this.productIterator = new ProductIterator(this.productCatalog);
    }

    @Override
    public Iterator getIterator() {
        return this.productIterator;
    }
}