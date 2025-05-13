package hus.oop.lab11.observer.pseudocode;

import java.util.HashMap;

public class EventManager {
    private HashMap<String, EventListeners> listeners = new HashMap<String, EventListeners>();

    public void subscribe(String listener, EventListeners eventType) {
        listeners.put(listener, eventType);
    }

    public void unsubscribe(String listener, EventListeners eventType) {
        listeners.remove(listener, eventType);
    }

    public void notify(String open, String name) {
    }
}
