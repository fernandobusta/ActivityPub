/* Removes and retrieves the next message from inbox */
public interface ReadNextMessage {
    // Returns an Activity, or null if there are no messages
    Activity readNext();
}
