package structural_dp.adapter.posts;

import java.util.ArrayList;
import java.util.List;

public class ABCNewsAgency {
    private List<ITraditionalPost> posts;
    public ABCNewsAgency() {
        posts = new ArrayList<ITraditionalPost>();
    }

    public void add(ITraditionalPost post) {
        posts.add(post);
    }

    public ITraditionalPost getHighestLikeIndexPost() {
        double highestLikeIndex = posts.get(0).calculateLikeIndex();
        int index = 0;
        for (ITraditionalPost post : posts) {
            if (post.calculateLikeIndex() > highestLikeIndex) {
                highestLikeIndex = post.calculateLikeIndex();
                index = posts.indexOf(post);
            }
        }
        return posts.get(index);
    }
}
