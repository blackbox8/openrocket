package info.openrocket.swing.listeners;
// Step 2:
// Create a broadcaster that notifies all listeners

import java.util.ArrayList;
import java.util.List;

public class HelloBroadcaster {
    private final List<HelloListener> listeners = new ArrayList<>();

    public void addHelloListener(HelloListener listener) {
        listeners.add(listener);
    }

    public void removeHelloListener(HelloListener listener) {
        listeners.remove(listener);
    }

    public void broadcastHello(String message) {
        for (HelloListener listener : listeners) {
            listener.onHelloEvent(message);
        }
    }
}
