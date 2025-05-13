package hus.oop.lab11.example;

public class Main {
    public static void main(String[] args) {
        NameCollection nameCollection = new NameCollection();
        nameCollection.addName("Alice");
        nameCollection.addName("Bob");
        nameCollection.addName("Charlie");

        MyIterator iterator = nameCollection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
