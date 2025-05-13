package hus.oop.lab11.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameIterator implements MyIterator {
    private List<String> names;
    private int index;

    public NameIterator(List<String> names) {
        this.names = names;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < names.size();
    }

    public Object next() {
        if (hasNext()) {
            return names.get(index++);
        }
        return null;
    }
}

