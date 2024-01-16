/**
 * Represents a client app that handles inboxes and outboxes.
 * @since 2023-04-02
 * @author Fernando Bustamante
 */
public interface App {
    
    /**
     * Retrieves the inbox of the app.
     * @return the inbox of the app
     */
    Inbox getInbox();
    
    /**
     * Retrieves the outbox of the app.
     * @return the outbox of the app
     */
    Outbox getOutbox();
    
    /**
     * Prints a demo of the app in action.
     * @return a string that represents the demo of the app in action
     */
    String demo();
}
