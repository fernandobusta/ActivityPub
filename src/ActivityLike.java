/**
 * @author Fernando Bustamante
 * @since 2023-04-02
 * Class ActivityLike - represents actions of Liking an object
*/
public class ActivityLike extends ProfileActivity<ActivityLike> {
    
    /** The person associated with this activity like event. */
    private Person person;
    
    /** The stream object associated with this activity like event. */
    private StreamObject streamObject;
    
    /** The summary string associated with this activity like event. */
    private String summary;

    /**
     * Creates a new ActivityCreate instance with the specified URI identifier, person, stream object, and summary.
     * @param URI the URI identifier for this activity like event
     * @param person the person associated with this activity like event
     * @param streamObject the stream object associated with this activity like event
     * @param summary the summary string associated with this activity like event
     */
    ActivityLike(String URI, Person person, StreamObject streamObject, String summary) {
        super(URI);
        setPerson(person);
        setStreamObject(streamObject);
        setSummary(summary);
    }

    /**
     * Returns the person associated with this activity like event.
     * @return the person associated with this activity like event
     */
    public Person getPerson() {
        return this.person;
    }

    /**
     * Sets the person associated with this activity like event.
     * @param person the person associated with this activity like event
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Returns the stream object associated with this activity like event.
     * @return the stream object associated with this activity like event
     */
    public StreamObject getStreamObject() {
        return this.streamObject;
    }

    /**
     * Sets the stream object associated with this activity like event.
     * @param streamObject the stream object associated with this activity like event
     */
    public void setStreamObject(StreamObject streamObject) {
        this.streamObject = streamObject;
    } 

    /**
     * Returns the summary string associated with this activity like event.
     * @return the summary string associated with this activity like event
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Sets the summary string associated with this activity like event.
     * @param summary the summary string associated with this activity like event
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Add new person and object to both respective lists
     */
    public void newLike(Person person, StreamObject other) {
        person.getLikes().add(this.getStreamObject());
        other.getLikes().add(this.getPerson());
    }
}
