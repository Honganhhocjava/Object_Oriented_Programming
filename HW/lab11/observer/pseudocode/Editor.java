package hus.oop.lab11.observer.pseudocode;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor(EventManager events) {
        this.events = events;
    }

    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    public void saveFile() {
        events.notify("save", file.getName());

    }
}
