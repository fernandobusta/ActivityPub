/**
 * @author Fernando Bustamante
 * @since 2023-04-02
 */

import java.util.List;

/**
 * Class Person - represents a profile in the net
 */
public class Person {
    /**
     * Variables of Person
     */
    private String URI;                     // URI of the person (profile)
    private String name;                    // Name of profile
    private String preferredUsername;       // Username of profile
    private String summary;                 // Summary of account
    private int inbox;                      // Inbox of account
    private int outbox;                     // Outbox of account
    private List<Person> followers;         // Followers of account
    private List<Person> following;         // Following profiles of account

    public Person(String URI, String name, String preferredUsername, String summary) {
        setURI(URI);
        setName(name);
        setPreferredUsername(preferredUsername);
        setSummary(summary);
        setInbox();
        setOutbox();
    }

    // =============================== Getters and Setters ======================
    /**
     * URI
     * @return
     */
    public String getURI() {
        return this.URI;
    }
    public void setURI(String URI) {
        this.URI = URI;
    }
    
    /**
     * Name
     * @return
     */
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Preffered username
     * @return
     */
    public String getPreferredUsername() {
        return this.preferredUsername;
    }
    public void setPreferredUsername(String preferredUsername) {
        this.preferredUsername = preferredUsername;
    }
    
    /**
     * Summary
     * @return
     */
    public String getSummary() {
        return this.summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    
    /**
     * Inbox
     * @return
     */
    public int getInbox() {
        return inbox;
    }
    public void setInbox() {
    }

    /**
     * Outbox
     * @return
     */
    public int getOutbox() {
        return outbox;
    }
    public void setOutbox() {
    }

    /**
     * Followers
     * @return
     */
    public List<Person> getFollowers() {
        return followers;
    }
    public void setFollowers(List<Person> followers) {
        this.followers = followers;
    }

    /**
     * Following
     * @return
     */
    public List<Person> getFollowing() {
        return following;
    }
    public void setFollowing(List<Person> following) {
        this.following = following;
    }

    // ============================ toString ===========================
    /**
     * toString method returning info about person
     * @return String
     */
    public String toString() {
        String message = "";
        return message;
    }
}
