package hus.oop.lab11.observer;

public class OctalObserver extends MyObserver {
    public Subject subject;
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }
    @Override
    void update() {
        System.out.println("Octal Observer get an update");
    }
}