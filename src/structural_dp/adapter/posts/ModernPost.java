package structural_dp.adapter.posts;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ModernPost extends Post {
    private int likeCount;
    private int loveCount;
    private int careCount;
    private int laughCount;
    private int astonishedCount;
    private int sadCount;
    private int angryCount;

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getLoveCount() {
        return loveCount;
    }

    public void setLoveCount(int loveCount) {
        this.loveCount = loveCount;
    }

    public int getCareCount() {
        return careCount;
    }

    public void setCareCount(int careCount) {
        this.careCount = careCount;
    }

    public int getLaughCount() {
        return laughCount;
    }

    public void setLaughCount(int laughCount) {
        this.laughCount = laughCount;
    }

    public int getAstonishedCount() {
        return astonishedCount;
    }

    public void setAstonishedCount(int astonishedCount) {
        this.astonishedCount = astonishedCount;
    }

    public int getSadCount() {
        return sadCount;
    }

    public void setSadCount(int sadCount) {
        this.sadCount = sadCount;
    }

    public int getAngryCount() {
        return angryCount;
    }

    public void setAngryCount(int angryCount) {
        this.angryCount = angryCount;
    }

    public ModernPost(String postName, Integer postId, LocalDate postDate, String content, int likeCount, int loveCount, int careCount, int laughCount, int astonishedCount, int sadCount, int angryCount) {
        super(postName, postId, postDate, content);
        this.likeCount = likeCount;
        this.loveCount = loveCount;
        this.careCount = careCount;
        this.laughCount = laughCount;
        this.astonishedCount = astonishedCount;
        this.sadCount = sadCount;
        this.angryCount = angryCount;
    }

    public double calculateIndex() {
        long dateSpan = ChronoUnit.DAYS.between(LocalDate.now(), this.getPostDate());
        return (this.likeCount + this.loveCount*2 + this.careCount*1.5 + this.laughCount*1.2 + this.astonishedCount - this.sadCount - this.angryCount*3)/ ((this.likeCount + this.loveCount + this.careCount + this.astonishedCount + this.sadCount + this.angryCount + this.laughCount)*1.2*dateSpan);
    }
}
