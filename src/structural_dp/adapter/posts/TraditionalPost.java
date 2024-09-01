package structural_dp.adapter.posts;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TraditionalPost extends Post implements ITraditionalPost{
    private int likeCount;
    private int dislikeCount;

    public TraditionalPost(int likeCount, int dislikeCount) {
        this.likeCount = likeCount;
        this.dislikeCount = dislikeCount;
    }

    public TraditionalPost(String postName, Integer postId, LocalDate postDate, String content, int likeCount, int dislikeCount) {
        super(postName, postId, postDate, content);
        this.likeCount = likeCount;
        this.dislikeCount = dislikeCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(int dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    @Override
    public double calculateLikeIndex() {
        long dateSpan = ChronoUnit.DAYS.between(LocalDate.now(), this.getPostDate());
        return (double) (this.likeCount - this.dislikeCount) / ((this.likeCount + this.dislikeCount)*dateSpan);
    }

    @Override
    public void print() {
        System.out.println("Traditional Post");
        System.out.println("Post Name: " + this.getPostName());
        System.out.println("Post ID: " + this.getPostId());
        System.out.println("Post Date: " + this.getPostDate());
        System.out.println("Post Content: " + this.getContent());
        System.out.println("Post Like Count: " + this.getLikeCount());
        System.out.println("Post Dislike Count: " + this.getDislikeCount());
        System.out.println("Post Like Index: " + this.calculateLikeIndex());
    }
}
