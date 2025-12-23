package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>  result = new ArrayList<>();
        if (root == null){
            return result;
        }
   Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int currentLevel = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<currentLevel;i++){
                TreeNode currentNode = queue.poll();
                list.add(currentNode.val);
                if (currentNode.left!=null){
                  queue.offer(currentNode.left);
                }   if (currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(list);
        }

        return result;
    }

    public TreeNode findSucceesor(TreeNode root, int key){
        if (root==null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if (currentNode.left!=null){
                queue.offer(currentNode.left);
            }   if (currentNode.right!=null){
                queue.offer(currentNode.right);
            }

            if (currentNode.val==key){
                break;
            }
        }
        return queue.peek();
    }

    public static class TreeNode{
        TreeNode left ;
        TreeNode right;
   int val;

        TreeNode(int val){
       this.val=val;
   }

    }
}


