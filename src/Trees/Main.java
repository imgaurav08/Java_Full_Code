package Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EgBinaryTree binaryTree = new EgBinaryTree();
        ZigZagLevelTraversal bst = new ZigZagLevelTraversal();
        ZigZagLevelTraversal.TreeNode node= new ZigZagLevelTraversal.TreeNode(10);
        node.left = new ZigZagLevelTraversal.TreeNode(13);
        node.right = new ZigZagLevelTraversal.TreeNode(15);
        node.left.left = new ZigZagLevelTraversal.TreeNode(19);
        node.right.right = new ZigZagLevelTraversal.TreeNode(21);
       // System.out.println(bst.levelOrder(node));
        System.out.println();
        System.out.println(" Value ");
        System.out.println(bst.zigzagLevelOrder(node));
//        binaryTree.createTree();
//        binaryTree.display(binaryTree.root);
//        System.out.println();
//        System.out.println(" Postorder ");
//
//        binaryTree.postOrder(binaryTree.root);
//
//
//        System.out.println();
//        System.out.println(" Level Order ");
//
//        binaryTree.levelOrder(binaryTree.root);
//
//        System.out.println();
//        System.out.println(" Max num ");
//
//        System.out.println(binaryTree.findMax(binaryTree.root));
    }
}
