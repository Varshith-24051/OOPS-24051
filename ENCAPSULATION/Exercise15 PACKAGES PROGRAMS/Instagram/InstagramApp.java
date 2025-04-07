public class InstagramApp {
    public static void main(String[] args) {
        User user = new User("john_doe", "Traveler, Photographer.");
        user.displayUser();

        Post post = new Post("Exploring the beaches of Bali!", "beach_bali.jpg");
        post.displayPost();

        Comment comment = new Comment("Wow! Amazing view!", "alice_smith");
        comment.displayComment();
    }
}
