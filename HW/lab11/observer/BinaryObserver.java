package hus.oop.lab11.observer;

public class BinaryObserver extends MyObserver {
    public Subject subject;
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }
    @Override
    void update() {
        System.out.println("Binary Observer get an update");
    }
}
