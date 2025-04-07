public class User {
    private String username;
    private String bio;

    public User(String username, String bio) {
        this.username = username;
        this.bio = bio;
    }

    public void displayUser() {
        System.out.println("Username: " + username);
        System.out.println("Bio: " + bio);
    }
}

public class Post {
    private String caption;
    private String imageUrl;

    public Post(String caption, String imageUrl) {
        this.caption = caption;
        this.imageUrl = imageUrl;
    }

    public void displayPost() {
        System.out.println("Caption: " + caption);
        System.out.println("Image: " + imageUrl);
    }
}

public class Comment {
    private String commentText;
    private String commenter;

    public Comment(String commentText, String commenter) {
        this.commentText = commentText;
        this.commenter = commenter;
    }

    public void displayComment() {
        System.out.println(commenter + " commented: " + commentText);
    }
}
