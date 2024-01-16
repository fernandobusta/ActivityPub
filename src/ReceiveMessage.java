/**
 * This interface defines the functionality to receive a message and add it to the Inbox.
 * @since 2023-04-02
 * @author Fernando Bustamante
 */
public interface ReceiveMessage {
    /**
     * This method receives a message and adds it to the Inbox.
     * @param activity The Activity to be added to the Inbox.
     * @return A boolean indicating whether the operation was successful or not.
     */
    boolean receive(Activity activity);
}
