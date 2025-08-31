import java.util.*;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) {
            return 0; // Handle case when no interactions are provided
        }
        int total = 0;
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) {
            return "Viral";
        } else if (engagementScore >= 500) {
            return "Popular";
        } else if (engagementScore >= 100) {
            return "Good";
        } else if (engagementScore >= 50) {
            return "Low";
        } else {
            return "Poor";
        }
    }

    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        if (hashtags == null) {
            hashtags = new String[0];
        }
        String[] fixedSizeHashtags = new String[5];
        for (int i = 0; i < Math.min(hashtags.length, 5); i++) {
            fixedSizeHashtags[i] = hashtags[i];
        }

        HashSet<String> uniqueSet = new HashSet<>();
        for (String tag : fixedSizeHashtags) {
            if (tag != null) {
                uniqueSet.add(tag);
            }
        }

        return new ArrayList<>(uniqueSet);
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trendingPosts = new LinkedList<>();
        if (posts == null || postEngagement == null) {
            return trendingPosts;
        }
        for (String post : posts) {
            Integer engagement = postEngagement.get(post);
            if (engagement != null && engagement > 500) {
                trendingPosts.add(post);
            }
        }
        return trendingPosts;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> uniqueAuthors = new HashSet<>();
        if (authors != null) {
            for (String author : authors) {
                if (author != null) {
                    uniqueAuthors.add(author);
                }
            }
        }
        return uniqueAuthors;
    }

    public static void main(String[] args) {
        PostManager manager = new PostManager();

        int engagementScore = manager.calculateEngagement(150, 75, 25);
        String category = manager.getCategoryRating(engagementScore);

        manager.displayPostStats("Java Programming Tips", engagementScore);
        System.out.println();
        manager.displayPostStats("Java Programming Tips", engagementScore, category);

        System.out.println("\n--- Hashtags ---");
        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        System.out.println("\n--- Trending Posts ---");
        ArrayList<String> posts = new ArrayList<>();
        posts.add("Java Programming Tips");
        posts.add("Beginner Coding Guide");
        posts.add("Daily Tech News");

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagementScore);
        postEngagement.put("Beginner Coding Guide", 600);
        postEngagement.put("Daily Tech News", 1200);

        LinkedList<String> trending = manager.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trending);

        System.out.println("\n--- Unique Authors ---");
        HashSet<String> uniqueAuthors = manager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
