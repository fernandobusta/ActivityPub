/* Provides inbox functionality */
public interface extends ReceiveMessage, ReadNextMessage {
    // Returns count of unread messages in inbox
    int getCount();
}
