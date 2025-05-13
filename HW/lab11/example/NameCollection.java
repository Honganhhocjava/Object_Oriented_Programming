package hus.oop.lab11.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameCollection implements Aggregate {
    private List<String> names;

    public NameCollection() {
        names = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public MyIterator createIterator() {
        return new NameIterator(names);
    }
}
