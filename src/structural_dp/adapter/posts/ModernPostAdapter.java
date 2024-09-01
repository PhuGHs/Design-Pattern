package structural_dp.adapter.posts;

public class ModernPostAdapter implements ITraditionalPost {
    ModernPost modernPost;
    public ModernPostAdapter(ModernPost modernPost) {
        this.modernPost = modernPost;
    }

    @Override
    public double calculateLikeIndex() {
        return this.modernPost.calculateIndex();
    }

    @Override
    public void print() {
        System.out.println("Modern Post: ");
        System.out.println("Post Name: " + modernPost.getPostName());
        System.out.println("Post Id: " + modernPost.getPostId());
        System.out.println("Post Date: " + modernPost.getPostDate());
        System.out.println("Content: " + modernPost.getContent());
        System.out.println("Like Index: " + this.calculateLikeIndex());
    }
}
