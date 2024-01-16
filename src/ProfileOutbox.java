/**
 * @author Fernando Bustamante
 * @since 2023-04-02
 */

import java.util.ArrayList;
import java.util.List;

public class ProfileOutbox implements Outbox {
    
    /** A list of messages in the outbox. */
    private List<Activity> messages;

    /**
     * Constructs a new ProfileOutbox object and initializes its list of messages to an empty ArrayList.
     */
    ProfileOutbox() {
        setMessages();
    }

    /**
     * Initializes the list of messages to an empty ArrayList.
     */
    public void setMessages() {
        this.messages = new ArrayList<>();
    }

    /**
     * Returns the list of messages in the outbox.
     * @return The list of messages in the outbox.
     */
    public List<Activity> getMessages() {
        return this.messages;
    }

    /**
     * Returns the number of unsent messages in the outbox.
     * @return The number of unsent messages in the outbox.
     */
    public int getCount() {
        return messages.size();
    }

    /**
     * Adds a new message to the outbox.
     * @param activity The message to be added to the outbox.
     * @return true if the message was successfully added, false otherwise.
     */
    public boolean send(Activity activity) {
        return this.messages.add(activity);
    }

    /**
     * Removes and returns the next message in the outbox.
     * @return The next message in the outbox, or null if there are no more messages.
     */
    public Activity deliverNext() {
        if (!messages.isEmpty()) {
            return this.messages.remove(0);
        }
        return null;
    }

    /**
     * Returns a string representation of the outbox, including the number of unsent messages.
     * @return A string representation of the outbox.
     */
    public String toString() {
        String message = "- Outbox: " + this.getCount();
        return message;
    }

}
