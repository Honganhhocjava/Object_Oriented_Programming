package hus.oop.lab11.observer.pseudocode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoggingListener implements EventListeners{
    private File log;
    private String message;

    public LoggingListener(String log_filename, String message) {
        this.log = new File(log_filename);
        this.message = message;
    }

    @Override
    public void update(String filename) throws IOException {
        FileWriter log = new FileWriter(filename);
        log.write(message);
    }
}
