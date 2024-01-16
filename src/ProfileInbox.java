/**
 * Provides inbox functionality for a user's profile
 * @author Fernando Bustamante
 * @since 2023-04-02
 */
import java.util.ArrayList;
import java.util.List;

public class ProfileInbox implements Inbox {

    private List<Activity> notifications;

    /**
     * Creates a new ProfileInbox and sets the notifications list to an empty ArrayList.
     */
    public ProfileInbox() {
        setNotifications();
    }

    /**
     * Sets the notifications list to an empty ArrayList.
     */
    public void setNotifications() {
        this.notifications = new ArrayList<>();
    }

    /**
     * Get the number of notifications in the inbox
     * @return the count of notifications in the inbox
     */
    public int getCount() {
        return notifications.size();
    }

    /**
     * Adds a received activity to the inbox
     * @param activity the activity to add to the inbox
     * @return true if the activity was added successfully, false otherwise
     */
    public boolean receive(Activity activity) {
        return this.notifications.add(activity);
    }

    /**
     * Removes and returns the next activity from the inbox
     * @return the next activity in the inbox or null if the inbox is empty
     */
    public Activity readNext() {
        if (!notifications.isEmpty()) {
            return this.notifications.remove(0);
        }
        return null;
    }

    /**
     * Returns a string representation of the inbox
     * @return a string with information about the inbox
     */
    public String toString() {
        String message = "- Inbox: " + this.getCount();
        return message;
    }

}
