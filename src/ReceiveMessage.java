/* Receives a message and adds it to the Inbox */
public interface ReceiveMessage {
    // Returns a success / failure message
    boolean receive(Activity);
}
