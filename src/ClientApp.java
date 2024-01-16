/**
 * @since 2023-04-02
 * @author Fernando Bustamante
 */
public class ClientApp implements App {

    private Inbox inbox;
    private Outbox outbox;

    /**
     * Constructs a new ProfileApp object and initializes the Inbox and Outbox.
     */
    ClientApp() {
        setInbox();
        setOutbox();
    }

    /**
     * Get the inbox object
     * @return Inbox object
     */
    public Inbox getInbox() {
        return this.inbox;
    }

    /**
     * Set the inbox object
     */
    public void setInbox() {
        this.inbox = new ProfileInbox();
    }

    /**
     * Get the outbox object
     * @return Outbox object
     */
    public Outbox getOutbox() {
        return this.outbox;
    }

    /**
     * Set the outbox object
     */
    public void setOutbox() {
        this.outbox = new ProfileOutbox();
    }

    /**
     * Demonstration method
     * @return String with demo message
     */
    public String demo() {
        
        // Person 1
        Person p1 = new Person("https://www.MyApp.com/user/fernando", "Fernando Bustamante", "busta",  "I am Fernando");
        System.out.print("Creating Person 1");
        System.out.println(p1);

        // Person 2
        System.out.print("\nCreating Person 2");
        Person p2 = new Person("https://www.MyApp.com/user/jervin", "Jervin Baylon", "jervinio",  "I am Jervin");
        System.out.println(p2);

        // Follow
        System.out.println("\nPerson 1 follows Person 2");
        ActivityFollow p1Followp2 = new ActivityFollow("https://www.MyApp.com/user/fernando/follow/jervinio", p1, p2, "Fernando follows Jervinio");
        System.out.println(p1Followp2);
        
        // Post
        System.out.println("\nPerson 1 creates a post");
        StreamObject post1 = new StreamObject("https://www.MyApp.com/user/fernando/post/#0000", "This is a photo", "busta", Audience.PRIVATE, "This is a Post by Fernando", "My Post", "2023-04-15");
        ActivityCreate upload = new ActivityCreate("https://www.MyApp.com/post/#0000", p1, post1, "Fernando just uploaded a post!");
        System.out.println(post1);
        System.out.println(upload);

        // Like
        System.out.println("\nPerson 2 likes post");
        ActivityLike like = new ActivityLike("https://www.MyApp.com/user/jervinio/like/post/#0000", p2, post1, "Jervinio likes Fernando's post");
        like.newLike(p2, post1);

        // Inbox
        System.out.println("\nPerson 1 inbox");
        System.out.println(p1.getInbox());
        
        // Outbox
        System.out.println("\nPerson 1 outbox");
        System.out.println(p1.getOutbox());

        return "\nDemo finished";
    }

    /**
     * Main method for running the ProfileApp demo
     */
    public static void main (String[] args) {
        ClientApp MyApp = new ClientApp();
        System.out.println(MyApp.demo());
    }
}
