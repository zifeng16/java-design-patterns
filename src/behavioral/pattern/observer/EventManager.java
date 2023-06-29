package behavioral.pattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Registry
public class EventManager {

    // <eventType, list of listeners to this eventType>
    Map<String, List<EventListener>> subsribersMap = new HashMap<>();

    // an arbitrary number of operation types
    public EventManager(String... operations) {
        for (String operation : operations) {
            subsribersMap.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String event, EventListener listener) {
        List<EventListener> subscribers = subsribersMap.get(event);
        if (!subscribers.contains(listener)) {
            subscribers.add(listener);
        }
    }

    public void unsubscribe(String event, EventListener listener) {
        List<EventListener> subscribers = subsribersMap.get(event);
        subscribers.remove(listener);
    }

    public void notifySubscribers(String event, String file) {
        List<EventListener> subscribers = subsribersMap.get(event);
        for (EventListener eventListener : subscribers) {
            eventListener.notify(event, file);
        }
    }
}
