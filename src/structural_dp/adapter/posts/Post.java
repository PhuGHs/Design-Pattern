package structural_dp.adapter.posts;

import java.time.LocalDate;

public class Post {
    private String postName;
    private Integer postId;
    private LocalDate postDate;
    private String content;

    public int getLikeIndex() {
        return likeIndex;
    }

    public void setLikeIndex(int likeIndex) {
        this.likeIndex = likeIndex;
    }

    private int likeIndex;

    public Post() {
    }

    public Post(String postName, Integer postId, LocalDate postDate, String content) {
        this.postName = postName;
        this.postId = postId;
        this.postDate = postDate;
        this.content = content;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
