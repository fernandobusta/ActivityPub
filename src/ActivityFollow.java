/**
 * @author Fernando Bustamante
 * @since 2023-04-02
 * Represents an activity follow event that includes a person, a stream object, and a summary string.
 */
public class ActivityFollow extends ProfileActivity<ActivityFollow> {
 
    /** The person associated with this activity follow event. */
    private Person person;
    
    /** The person associated with this activity follow event. */
    private Person other;
    
    /** The summary string associated with this activity follow event. */
    private String summary;


    /**
     * Creates a new ActivityCreate instance with the specified URI identifier, person, stream object, and summary.
     * @param URI the URI identifier for this activity follow event
     * @param person the person associated with this activity follow event
     * @param streamObject the stream object associated with this activity follow event
     * @param summary the summary string associated with this activity follow event
     */
    ActivityFollow(String URI, Person person, Person other, String summary) {
        super(URI);
        setPerson(person);
        setOther(other);
        setSummary(summary);
    }

    /**
     * Returns the person associated with this activity follow event.
     * @return the person associated with this activity follow event
     */
    public Person getPerson() {
        return this.person;
    }

    /**
     * Sets the person associated with this activity follow event.
     * @param person the person associated with this activity follow event
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Returns the person associated with this activity follow event.
     * @return the person associated with this activity follow event
     */
    public Person getOther() {
        return this.other;
    }

    /**
     * Sets the person associated with this activity follow event.
     * @param person the person associated with this activity follow event
     */
    public void setOther(Person other) {
        this.other = other;
    } 

    /**
     * Returns the summary string associated with this activity follow event.
     * @return the summary string associated with this activity follow event
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Sets the summary string associated with this activity follow event.
     * @param summary the summary string associated with this activity follow event
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Adds a "follow" relationship between two people by updating their follower and following lists.
     * @param person1 the person who will follow the other person
     * @param person2 the person who will be followed by the other person
     */
    public void addFollow(Person person1, Person person2) {
        person1.getFollowers().add(person2);
        person2.getFollowing().add(person1);
    }


    /**
     * Returns a string representation of this activity follow event.
     * @return a string representation of this activity follow event
     */
    public String toString() {
        String message = "- URI: " + this.getURI();
        message += "\n- person: " + this.person;
        message += "\n- other: " + this.other;
        message += "\n- summary: " + this.summary;
        return message;
    }
}
