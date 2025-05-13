package hus.oop.lab11.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        MyObserver observer1 = new HexaObserver(subject);
        MyObserver observer2 = new BinaryObserver(subject);
        MyObserver observer3 = new OctalObserver(subject);

        System.out.println(subject);
        subject.setState(90);
        System.out.println(subject);

    }
}
