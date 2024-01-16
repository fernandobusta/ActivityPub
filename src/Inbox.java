/**
 * @since 2023-04-02
 * @author Fernando Bustamante
 * Defines an inbox interface that provides inbox functionality.
 */
public interface Inbox extends ReceiveMessage, ReadNextMessage {
    
    /**
     * Returns the count of unread messages in the inbox.
     * @return the count of unread messages in the inbox
     */
    int getCount();
}
