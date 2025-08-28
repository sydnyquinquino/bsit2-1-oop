import java.util.*;

public class PostManager {
    public int calculateEngagement(int... interactions) {
        int sum = 0;
        if (interactions != null) {
            for (int i : interactions) sum += i;
        }
        return sum;
    }

    public String getCategoryRating(int score) {
        if (score >= 1000) return "Viral";
        if (score >= 500) return "Popular";
        if (score >= 100) return "Good";
        if (score >= 50) return "Low";
        return "Poor";
    }

    public void displayPostStats(String title, int score, String category) {
        System.out.println("Post: " + title);
        System.out.println("Engagement Score: " + score);
        System.out.println("Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        HashSet<String> set = new HashSet<>();
        ArrayList<String> unique = new ArrayList<>();
        if (hashtags != null) {
            for (int i = 0; i < Math.min(5, hashtags.length); i++) {
                if (set.add(hashtags[i])) unique.add(hashtags[i]);
            }
        }
        return unique;
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> engagements) {
        LinkedList<String> trending = new LinkedList<>();
        if (posts != null && engagements != null) {
            for (String p : posts) {
                Integer e = engagements.get(p);
                if (e != null && e > 500) trending.add(p);
            }
        }
        return trending;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> set = new HashSet<>();
        if (authors != null) for (String a : authors) set.add(a);
        return set;
    }

    public static void main(String[] args) {
        System.out.println("═══ Social Media Post Manager ═══");
        PostManager pm = new PostManager();

        String postTitle = "Java Programming Tips";
        int engagement = pm.calculateEngagement(150, 75, 25); // 250
        String category = pm.getCategoryRating(engagement);

        pm.displayPostStats(postTitle, engagement, category);
        System.out.println();

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        ArrayList<String> posts = new ArrayList<>();
        posts.add("Java Programming Tips");
        posts.add("Advanced Java Tutorial");
        posts.add("Spring Boot Guide");

        HashMap<String, Integer> engagements = new HashMap<>();
        engagements.put("Java Programming Tips", engagement); // 250
        engagements.put("Advanced Java Tutorial", 1200);
        engagements.put("Spring Boot Guide", 650);

        LinkedList<String> trendingPosts = pm.findTrendingPosts(posts, engagements);
        System.out.println("Trending Posts: " + trendingPosts);

        HashSet<String> authors = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");

        ArrayList<String> authorList = new ArrayList<>(authors);
        Collections.sort(authorList);
        System.out.println("Unique Authors: " + authorList);
    }
}
