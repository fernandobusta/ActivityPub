/**
 * @author Fernando Bustamante
 * @since 2023-04-02
 */

 import java.util.ArrayList;
 import java.util.List;
 
/**
 * Class StreamObject - represents actions related to a social media stream object
*/
public class StreamObject {
    /**
     * Variables of StreamObject
     */
    private String URI;             // Unique identifier of object
    private String attachment;      // Attachements of object
    private String attributedTo;    // Creator of object
    private Audience audience;      // Audience of the post
    private List<Person> likes;     // List of users that liked the post
    private int shares;             // Number of times it has been shared
    private String content;         // Content of the post
    private String name;            // Name of the object
    private String published;       // Published date of object
    private boolean deleted;        // True if the object has been deleted

    public StreamObject(String URI, String attachment, String attributedTo, Audience audience, String content, String name, String published) {
        setURI(URI);
        setAttachment(attachment);
        setAttributedTo(attributedTo);
        setAudience(audience);
        setLikes();
        setShares(0);
        setContent(content);
        setName(name);
        setPublished(published);
        setDeleted(false);
    }

    /**
     * Getter for URI
     * @return URI
     */
    public String getURI() {
        return this.URI;
    }
    /**
     * Setter for URI
     * @param URI
     */
    public void setURI(String URI) {
        this.URI = URI;
    }
    
    /**
     * Getter for Attachment
     * @return Attachment
     */
    public String getAttachment() {
        return this.attachment;
    }
    /**
     * Setter for Attachment
     * @param attachment
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    /**
     * Getter for AttributedTo
     * @return AttributedTo
     */
    public String getAttributedTo() {
        return this.attributedTo;
    }
    /**
     * Setter for AttributedTo
     * @param attributedTo
     */
    public void setAttributedTo(String attributedTo) {
        this.attributedTo = attributedTo;
    }

    /**
     * Getter for Audience
     * @return Audience
     */
    public Audience getAudience() {
        return this.audience;
    }
    /**
     * Setter for Audience
     * @param audience
     */
    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    /**
     * Getter for Likes
     * @return Likes
     */
    public List<Person> getLikes() {
        return this.likes;
    }
    /**
     * Setter for Likes
     * @param likes
     */
    public void setLikes() {
        this.likes = new ArrayList<>();
    }

    /**
     * Getter for Shares
     * @return Shares
     */
    public int getShares() {
        return this.shares;
    }
    /**
     * Setter for Shares
     * @param shares
     */
    public void setShares(int shares) {
        this.shares = shares;
    }

    /**
     * Getter for Content
     * @return Content
     */
    public String getContent() {
        return this.content;
    }
    /**
     * Setter for Content
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
    
    /**
     * Getter for Name
     * @return Name
     */
    public String getName() {
        return this.name;
    }
    /**
     * Setter for Name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Published date
     * @return Published date
     */
    public String getPublished() {
        return this.published;
    }
    /**
     * Setter for Published date
     * @param published date
     */
    public void setPublished(String published) {
        this.published = published;
    }

    /**
     * Getter for Deleted object
     * @return Deleted object
     */
    public boolean getDeleted() {
        return this.deleted;
    }
    /**
     * Setter for Deleted object
     * @param deleted object
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * To String method for class
     * @return String message
     */
    public String toString() {
        String message = "- URI: " + this.URI;
        message += "\n- audience: " + this.audience;
        message += "\n- likes: " + this.likes;
        message += "\n- shares: " + this.shares;
        message += "\n- content: " + this.content;
        message += "\n- name: " + this.name;
        message += "\n- published: " + this.published;
        message += "\n- deleted: " + this.deleted;

        return message;
    }

}
