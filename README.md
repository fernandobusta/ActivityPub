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

Other than the above interfaces, you are free to implement the other classes or interfaces for Person, StreamObject, Activities, etc. as you see fit. You may implement thiings from ActivityPub and ActivityStreams as much as you want. At a minimum, your code must show the following:
1. Classes with appropriate fields and methods for Person;
2. Classes with appropriate fields and methods for StreamObject;
3. Classes with appropriate fields and methods for Activities of Like, Follow, Unfollow, Create and Delete;
4. Classes with appropriate fields and methods for Inbox;
5. Classes with appropriate fields and methods for Outbox;
6. Apropriate Getters/Setters and Access Modifiers for fields;
7. Appropriate Documentation following established styles and conventions;
8. Methods that show creation of Persons, them following or unfollowing each other, creating and handling various activities, using the inbox and outbox to receive and send them respectively.

## Demo
To demonstrate your code, you will write your own instances and use them in a manner that showcases the features of your implementation. This will be the output of *demo()* from *ClienApp*. To help Einstein execute this, your file should be called *ClientApp.java*. You may have your *main()* in any file you wish for testing purposes.

What you produce as the output is up to you - so write something that describes all features of the 'app' and showcases how you have implemented different requirements. For example, here is how I would produce such a demo document:

```
Person1 added
- URI: https://harshp.com/me
- name: Harshvardhan Pandit

Person2 added
- URI: https://harshp.com/anotherMe
- name: HJP

Person1 adds a CreateActivity to Outbox
- URI https://example.com/post001
- audience: GLOBAL
- likes: null
- shares: null
- content: "This is the first post in JavaVerse!"
- name: "First Post"
- published: "2023-03-16T16:00:00"
- deleted: false

Person1 Outbox delivery
- https://example.com/post001 posted

Person2 adds a FollowActivity to Outbox
- URI: https://harshp.com/anotherMe/activity001
- actor: https://harshp.com/anotherMe
- object: https://harshp.com/me

Person2 Outbox delivery
- https://harshp.com/anotherMe/activity001
- added https://harshp.com/me to Following list

Person1 Inbox delivery
- https://harshp.com/anotherMe/activity001

Person1 reads a FollowActivity from Inbox
- added https://harshp.com/anotherMe to Followers list
```
Note there are no other tests on Einstein beyond checking your code compiles and executing *demo()* produces the exact same output as submitted in *demo.txt*. To ensure this, store your program's output in the file, e.g. `java ClientApp > demo.txt`. On Einstein, I will produce `output.txt` from executing *demo()* and then do `diff output.txt demo.txt` to check both outputs are the same. 
