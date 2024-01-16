/**
 * @since 2023-04-02
 * @author Fernando Bustamante
 * Represents the possible audiences for a post or message.
 */
public enum Audience {
    /**
     * Indicates that the post or message is visible to everyone.
     */
    GLOBAL,
    /**
     * Indicates that the post or message is visible only to the author and specific recipients.
     */
    PRIVATE,
    /**
     * Indicates that the post or message is visible only to business contacts or members of a specific organization.
     */
    BUSINESS
}
