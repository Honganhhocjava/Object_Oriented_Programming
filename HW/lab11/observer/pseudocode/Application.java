package hus.oop.lab11.observer.pseudocode;

public class Application {
    public void config() {
        Editor editor = new Editor(new EventManager());
        LoggingListener logger = new LoggingListener("this/is/path", "Someone has open the file: %s");
        editor.events.subscribe("open", logger);
        EmailAlertsListener emailAlert = new EmailAlertsListener("gmail", "Someone has changed the file: %s");
        editor.events.subscribe("save", emailAlert);
    }
}
