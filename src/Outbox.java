/**
 * @since 2023-04-02
 * @author Fernando Bustamante
 * Defines an outbox interface that provides outbox functionality.
 */
public interface Outbox extends SendMessage, DeliverNextMessage {
    
    /**
     * Returns the count of unsent messages in the outbox.
     * @return the count of unsent messages in the outbox
     */
    int getCount();
}
