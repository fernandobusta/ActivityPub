/**
 * Defines an interface for reading the next message from an inbox.
 * @since 2023-04-02
 * @author Fernando Bustamante
 */
public interface ReadNextMessage {
    
    /**
     * Removes and retrieves the next message from the inbox.
     * @return an Activity, or null if there are no messages
     */
    Activity readNext();
}
