package hus.oop.lab11.Iterator;

public class ProductIterator implements Iterator {
    private String[] items;
    private int position = 0 ;

    public ProductIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }


    @Override
    public Object next() {
       String item = items[position];
       position = position + 1;
       return item;
    }
}
