/* Provides Outbox functionality */
public interface Outbox extends SendMessage, DeliverNextMessage {
    // Returns count of unsent messages in outbox
    int getCount();
}
