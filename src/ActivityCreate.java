/**
 * @author Fernando Bustamante
 * @since 2023-04-02
 * Represents an activity creation event that includes a person, a stream object, and a summary string.
 */
public class ActivityCreate extends ProfileActivity<ActivityCreate>{
    
    /** The person associated with this activity creation event. */
    private Person person;
    
    /** The stream object associated with this activity creation event. */
    private StreamObject streamObject;
    
    /** The summary string associated with this activity creation event. */
    private String summary;

    /**
     * Creates a new ActivityCreate instance with the specified URI identifier, person, stream object, and summary.
     *
     * @param URI the URI identifier for this activity creation event
     * @param person the person associated with this activity creation event
     * @param streamObject the stream object associated with this activity creation event
     * @param summary the summary string associated with this activity creation event
     */
    ActivityCreate(String URI, Person person, StreamObject streamObject, String summary) {
        super(URI);
        setPerson(person);
        setStreamObject(streamObject);
        setSummary(summary);
    }

    /**
     * Returns the person associated with this activity creation event.
     *
     * @return the person associated with this activity creation event
     */
    public Person getPerson() {
        return this.person;
    }

    /**
     * Sets the person associated with this activity creation event.
     *
     * @param person the person associated with this activity creation event
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Returns the stream object associated with this activity creation event.
     *
     * @return the stream object associated with this activity creation event
     */
    public StreamObject getStreamObject() {
        return this.streamObject;
    }

    /**
     * Sets the stream object associated with this activity creation event.
     *
     * @param streamObject the stream object associated with this activity creation event
     */
    public void setStreamObject(StreamObject streamObject) {
        this.streamObject = streamObject;
    } 

    /**
     * Returns the summary string associated with this activity creation event.
     *
     * @return the summary string associated with this activity creation event
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Sets the summary string associated with this activity creation event.
     *
     * @param summary the summary string associated with this activity creation event
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
}
