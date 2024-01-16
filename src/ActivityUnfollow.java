/**
 * @author Fernando Bustamante
 * @since 2023-04-02
 * Represents an activity unfollow event that includes a person, a stream object, and a summary string.
 */
public class ActivityUnfollow extends ProfileActivity<ActivityUnfollow> {
 
    /** The person associated with this activity unfollow event. */
    private Person person;
    
    /** The stream object associated with this activity unfollow event. */
    private StreamObject streamObject;
    
    /** The summary string associated with this activity unfollow event. */
    private String summary;

    /**
     * Creates a new ActivityCreate instance with the specified URI identifier, person, stream object, and summary.
     * @param URI the URI identifier for this activity unfollow event
     * @param person the person associated with this activity unfollow event
     * @param streamObject the stream object associated with this activity unfollow event
     * @param summary the summary string associated with this activity unfollow event
     */
    ActivityUnfollow(String URI, Person person, StreamObject streamObject, String summary) {
        super(URI);
        setPerson(person);
        setStreamObject(streamObject);
        setSummary(summary);
    }

    /**
     * Returns the person associated with this activity unfollow event.
     * @return the person associated with this activity unfollow event
     */
    public Person getPerson() {
        return this.person;
    }

    /**
     * Sets the person associated with this activity unfollow event.
     * @param person the person associated with this activity unfollow event
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Returns the stream object associated with this activity unfollow event.
     * @return the stream object associated with this activity unfollow event
     */
    public StreamObject getStreamObject() {
        return this.streamObject;
    }

    /**
     * Sets the stream object associated with this activity unfollow event.
     * @param streamObject the stream object associated with this activity unfollow event
     */
    public void setStreamObject(StreamObject streamObject) {
        this.streamObject = streamObject;
    } 

    /**
     * Returns the summary string associated with this activity unfollow event.
     * @return the summary string associated with this activity unfollow event
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Sets the summary string associated with this activity unfollow event.
     * @param summary the summary string associated with this activity unfollow event
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Removes a "follow" relationship between two people by updating their follower and following lists.
     * @param person1 the person who currently follows the other person
     * @param person2 the person who is currently being followed by the other person
     */
    public void unfollow(Person person1, Person person2) {
        // Only remove if it is inside the list
        if (person1.getFollowing().contains(person2)) {
            person1.getFollowing().remove(person2);
        }
        if (person2.getFollowers().contains(person1)) {
            person2.getFollowers().remove(person1);
        }
    }

}
