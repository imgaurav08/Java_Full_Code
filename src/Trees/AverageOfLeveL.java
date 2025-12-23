package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLeveL {
    public static class TreeNode{
        TreeNode left ;
        TreeNode right;
        int val;

        TreeNode(int val){
            this.val=val;
        }

    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            double average=0.0;
            int currentLevel = queue.size();
            for (int i=0; i <currentLevel; i++){
              TreeNode currentNode=queue.poll();
               average+= currentNode.val;
            if (currentNode.left!=null){
                queue.offer(currentNode.left);
            }
                if (currentNode.right!=null){
                    queue.offer(currentNode.right);
                }

            }

            average=average/currentLevel;
            result.add(average);
        }


        return result;
    }


}
