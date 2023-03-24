/* Removes and delivers the next message from inbox */
public interface DeliverNextMessage {
    // Returns an Activity, or null if there are no messages
    Activity deliverNext();
}

