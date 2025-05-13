package hus.oop.lab11.observer.pseudocode;

import java.io.FileWriter;
import java.io.IOException;

public class EmailAlertsListener implements EventListeners{
    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String filename) throws IOException {
        FileWriter log = new FileWriter(filename);
        log.write(email);
    }
}
