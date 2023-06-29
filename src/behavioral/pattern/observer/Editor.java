package behavioral.pattern.observer;

/**
 *  Define events that are available
 */
public class Editor {

    public EventManager eventManager = new EventManager("open", "save");
    String file = "";

    public void openFile(String filename) {
        this.file = filename;
        eventManager.notifySubscribers("open", file);

    }

    public void saveFile() {
        if (file != "") {
            eventManager.notifySubscribers("save", file);
        }
    }

}
