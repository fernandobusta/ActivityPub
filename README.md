# CA269 - Activity Pub

## Overview
ActivityPub is a protocol for implementing descentralised social networks based on the ActivityStreams format. The project consists of implementing some of the data and methods required for this protocol to work.

In the most basic sense, ActivityPub specifies how different actors can communicate with each other. This means there are messages, inboxes and outboxes to store them, and activities to receive and send them - respectively. The vocabulary for these is specified by the ActivityStreams. The ActivityPub standards document has a good overview of what protocol is and how it is used.

The project consists of implementing some features of ActivityPub and ActivityStream. To start with this, refer to Section 3 - Objects, which defines and uses the term objects - which we've come to learn from doing Java. The ActivityStreams Core Types specify the basic types of objects required for ActivityPub to function.

### Object, Activity, Person

The below example is taken from the standards document, and refers to the *Person Object*. It looks like JSON, but its using JSON-LD - a subset of JSON for specifying Linked Data.

```
{"@context": "https://www.w3.org/ns/activitystreams",
 "type": "Person",
 "id": "https://social.example/alyssa/",
 "name": "Alyssa P. Hacker",
 "preferredUsername": "alyssa",
 "summary": "Lisp enthusiast hailing from MIT",
 "inbox": "https://social.example/alyssa/inbox/",
 "outbox": "https://social.example/alyssa/outbox/",
 "followers": "https://social.example/alyssa/followers/",
 "following": "https://social.example/alyssa/following/",
 "liked": "https://social.example/alyssa/liked/"}
 ```

From this, we ignore the @context as it represents a semantic identifier to specify what vocabulary is being used, and we're not going to be using different Namespaces - which are aking to Java's packages and meant to separate concepts from one another by providing some form of unique identifier or addresses. The *type* is a special field that defines the type of object it is - so this is similar to the Class or Interface the instance is a *type* of.

From a cursory reading of the ActivityPub and ActivityStreams documentations, we can express the above information as data fields. This is a simplified view of these protocols and used to provide an overview of how they function. To avoid confusion with Java's *Objects*, we are renaming *ActivityStreams*' Object ot *StreamObject* instead.

```
Person {
    name
    preferredUsername
    summary
    inbox
    outbox
    followers
    following
    liked
}

StreamObject {
    // The different object types are defined in ActivityStreams
    // https://www.w3.org/TR/activitystreams-vocabulary/#object-types
    URI
    attachment
    attributedTo
    audience
    likes
    shares
    content
    name
    published
    deleted
}

Activity {
    // The different activity types are defined in ActivityStreams
    // https://www.w3.org/TR/activitystreams-vocabulary/#activity-types
    URI
}

Inbox {
    URI
    activities
}

Outbox {
    URI
    activities
}
```

### Inbox, Outbox
#### Inbox
The inbox is a storage associated with a person where activities are sent to be received and acted upon by the Person. For example, if someone likes their post, they receive a notification for this in their new inbox. For example, the below activity notification means that the specified Actor has liked the target Object.

```
LikeActivity {
    URI
    Summary
    Actor
    StreamObject
}
```

On receiving this activity, the Person then updates their Object's likes list to include the Person (Actor). Additionally, if the Person has a User Agent such as a Web browser or a smartphone App, it can show the summary information as a notification to bring their attention. 
#### Outbox
The Outbox is a storage associated with a person where activities are sent. For example, if the person likes someone else's post, they send the same message as above to the other person's inbox.

On receiving this activity, the Person then updates their Object's likes list to include the Person (Actor). Additionally, if the Person has a User Agent such as a Web browser or a smartphone App, it can show the summary information as a notification to bring this to their attention.

## Tasks
Armed with the above information, you will be implementing a simplified social network called JavaSoc (which stands for Java Social System). To ensure consistency in your implementations, you **MUST** implement the interface *App* defined below ina class called *ClientApp*.

```
interface Activity {
    String getURI() { }
}

/* receives a message and adds it to the Inbox */
interface ReceiveMessage {
    // returns a success / failure message
    boolean receive(Activity);
}

/* removes and retrieves the next message from inbox */
interface ReadNextMessage {
    // returns an Activity, or null if there are no messages
    Activity readNext();
}

/* provides inbox functionality */
interface Inbox extends ReceiveMessage, ReadNextMessage {
    // returns count of unread messages in inbox
    int getCount();
}

/* sends a message and adds it to the Outbox */
interface SendMessage {
    boolean send(Activity);
}

/* removes and delivers the next message from inbox */
interface DeliverNextMessage {
    // returns an Activity, or null if there are no messages
    Activity deliverNext();
}

/* provides outbox functionality */
interface Outbox extends SendMessage, DeliverNextMessage {
    // returns count of unsent messages in outbox
    int getCount();
}

/* the client App that handles inboxes and outboxes */
interface App {
    Inbox getInbox(); // retrieves the inbox
    Outbox getOutbox(); // retrievs the outbox
    String demo(); // prints a demo of the app in action
}
```
