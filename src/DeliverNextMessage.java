/**
 * @since 2023-04-02
 * @author Fernando Bustamante
 * Defines a method for removing and delivering the next message from an inbox.
 */
public interface DeliverNextMessage {
    
    /**
     * Removes and delivers the next message from the inbox.
     * @return the next activity in the inbox, or null if there are no messages
     */
    Activity deliverNext();
}
