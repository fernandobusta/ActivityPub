/**
 * Sends a message and adds it to the Outbox
 * @since 2023-04-02
 * @author Fernando Bustamante
 */
public interface SendMessage {
    /**
     * Sends an activity and adds it to the Outbox.
     * @param activity the activity to be sent.
     * @return true if the activity was sent successfully, false otherwise.
     */
    boolean send(Activity activity);
}
