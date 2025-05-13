package hus.oop.lab11.observer;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<MyObserver> observers;
    private int state;

    public Subject() {
        this.state = 0;
        this.observers = new LinkedList<>();
    }

    public int getState() {
        return state;
    }

    public void setState(int newState) {
        if(this.state == newState) {
            return;
        }
        this.state = newState;
        dataChanged();
    }

    public void dataChanged() {
        notifyAllObservers();
    }
    public void attach() {

    }
    public void subscribe(MyObserver observer) {
        observers.add(observer);
    }
    public void unsubscribe(MyObserver observer) {
        observers.remove(observer);
    }
    public void notifyAllObservers() {
        for(MyObserver observer : this.observers ) {
            observer.update();
        }
    }

    @Override
    public String toString() {
        return "Subject{" +
                "state=" + state +
                '}';
    }
}

