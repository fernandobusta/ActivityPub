/**
 * @since 2023-04-02
 * @author Fernando Bustamante
 * Represents a profile activity with a URI identifier.
 */
public class ProfileActivity<Act> implements Activity {
    
    /** The URI identifier for this profile activity. */
    private String URI;

    /**
     * Creates a new ProfileActivity instance with the specified URI identifier.
     * @param URI the URI identifier for this profile activity
     */
    ProfileActivity(String URI) {
        setURI(URI);
    }

    /**
     * Sets the URI identifier for this profile activity.
     * @param URI the URI identifier for this profile activity
     */
    public void setURI(String URI) {
        this.URI = URI;
    }

    /**
     * Returns the URI identifier for this profile activity.
     * @return the URI identifier for this profile activity
     */
    public String getURI() {
        return this.URI;
    }
}
