package Trees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ZigZagLevelTraversal {
    public static class TreeNode{
        TreeNode left ;
        TreeNode right;
        int val;

        TreeNode(int val){
            this.val=val;
        }

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
List<List<Integer>> result = new ArrayList<>();
if (root==null){
    return result ;
}
        Deque<TreeNode> deque = new LinkedList<>();
  boolean reverse =false;
  deque.offer(root);
  while (!deque.isEmpty()){
      int levelSize = deque.size();
      List<Integer> list = new ArrayList<>(levelSize);
      for (int i=0; i< levelSize;i++){
  if (!reverse){
      TreeNode currentNode = deque.pollFirst();
      list.add(currentNode.val);
      if (currentNode.left!=null){
          deque.addLast(currentNode.left);
      }  if (currentNode.right!=null){
          deque.addLast(currentNode.right);
      }
  } else {
      TreeNode currentNode = deque.pollLast();
      list.add(currentNode.val);
      if (currentNode.right!=null){
          deque.addFirst(currentNode.right);
      }  if (currentNode.left!=null){
          deque.addFirst(currentNode.left);
      }
  }



      }
      reverse=!reverse;
      result.add(list);
  }
return result;
    }
}
