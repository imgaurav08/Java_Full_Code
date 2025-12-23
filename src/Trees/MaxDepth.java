package Trees;
import Trees.RightSideView;

public class MaxDepth {
    public int maxDepth(RightSideView.TreeNode root) {
if (root ==null){
    return 0;
}
int left = maxDepth(root.left);
int right = maxDepth(root.right);
        return 1+ Math.max(left,right);
    }
}
