/* The client App that handles inboxes and outboxes */
public interface App {
    Inbox getInbox();       // Retrieves the inbox
    Outbox getOutbox();     // Retrieves the outbox
    String demo();          // Prints a demo of the app in action
}
