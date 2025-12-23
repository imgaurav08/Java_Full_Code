package Trees;

public class CheckPath {
    static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val){
            this.val=val;
        }
    }

    public boolean ifPath(TreeNode root , int targetSum){
        if (root == null){
            return false;
        }

        if (root.left==null && root.right==null){
           return root.val==targetSum;
        }
return ifPath(root.left,targetSum- root.val)|| ifPath(root.right,targetSum- root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left= new TreeNode(4);
        root.right= new TreeNode(8);
        root.left.left= new TreeNode(11);
        root.left.right= new TreeNode(2);
        root.left.left.left= new TreeNode(7);
        root.right.right= new TreeNode(4);
        root.left.left= new TreeNode(13);
        CheckPath path = new CheckPath();

        System.out.println(path.ifPath(root,22)) ;
    }

}
