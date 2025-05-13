package hus.oop.lab11.observer;

public class HexaObserver extends MyObserver{
    public Subject subject;
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }
    @Override
    void update() {
        System.out.println("Hexa Observer get an update");
    }
}
