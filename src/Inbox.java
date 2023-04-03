/* Provides inbox functionality */
public interface Inbox extends ReceiveMessage, ReadNextMessage {
    // Returns count of unread messages in inbox
    int getCount();
}
