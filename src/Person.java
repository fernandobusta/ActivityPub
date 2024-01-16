/**
 * @author Fernando Bustamante
 * @since 2023-04-02
 */

import java.util.ArrayList;
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
    private Inbox inbox;                    // Inbox of account
    private Outbox outbox;                  // Outbox of account
    private List<Person> followers;         // Followers of account
    private List<Person> following;         // Following profiles of account
    private List<StreamObject> likes;

    /**
     * Constructor for Person 
     * @param URI
     * @param name
     * @param preferredUsername
     * @param summary
     */
    public Person(String URI, String name, String preferredUsername, String summary) {
        setURI(URI);
        setName(name);
        setPreferredUsername(preferredUsername);
        setSummary(summary);
        setInbox();
        setOutbox();
        setFollowers();
        setFollowing();
        setLikes();
    }

    // =============================== Getters and Setters ======================
    /**
     * URI
     * @return URI
     */
    public String getURI() {
        return this.URI;
    }
    /**
     * Set URI
     * @param URI
     */
    public void setURI(String URI) {
        this.URI = URI;
    }
    
    /**
     * Name
     * @return Name
     */
    public String getName() {
        return this.name;
    }
    /**
     * Set Name
     * @param name
     */
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
    /**
     * Set Username
     * @param preferredUsername
     */
    public void setPreferredUsername(String preferredUsername) {
        this.preferredUsername = preferredUsername;
    }
    
    /**
     * Summary
     * @return Summary
     */
    public String getSummary() {
        return this.summary;
    }
    /**
     * Set Summary
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
    
    /**
     * Inbox
     * @return Inbox of probile
     */
    public Inbox getInbox() {
        return this.inbox;
    }
    /**
     * Create new Inbox
     */
    public void setInbox() {
        this.inbox = new ProfileInbox();
    }

    /**
     * Outbox
     * @return Outbox of profile
     */
    public Outbox getOutbox() {
        return outbox;
    }
    /**
     * Create new Outbox
     */
    public void setOutbox() {
        this.outbox = new ProfileOutbox();
    }

    /**
     * Followers
     * @return list of Followers
     */
    public List<Person> getFollowers() {
        return followers;
    }
    /**
     * Set Followers
     */
    public void setFollowers() {
        this.followers = new ArrayList<>();
    }

    /**
     * Following
     * @return list of users following
     */
    public List<Person> getFollowing() {
        return following;
    }
    /**
     * Set the followers
     */
    public void setFollowing() {
        this.following = new ArrayList<>();
    }

    /**
     * Get the objects liked by profile
     * @return list of StreamObjects
     */
    public List<StreamObject> getLikes() {
        return this.likes;
    }
    /**
     * Set Likes
     */
    public void setLikes() {
        this.likes = new ArrayList<>();
    }
    
    /**
     * toString method returning info about person
     * @return String message
     */
    public String toString() {
        String message = "- URI: " + this.URI;
        message += "\n- name: " + this.name;
        message += "\n- prefered username: " + this.preferredUsername;
        message += "\n- summary: " + this.summary;
        return message;
    }
}
