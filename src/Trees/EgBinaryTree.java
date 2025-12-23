package Trees;


import java.util.LinkedList;
import java.util.Queue;

public class EgBinaryTree {
public   Node root;

public void createTree(){
    Node first = new Node(9);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);


    root = first;
    first.left= second;
    first.right= third;
    second.left = fourth;


}

public  void display(Node root){
if (root==null){
    return;
}

    System.out.print(root.data + " ");
display(root.left);
    display(root.right);
}

public void postOrder(Node root){
    if (root==null){
        return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
}


public void levelOrder(Node root){
    Queue<Node> queue = new LinkedList<>();
    if (root ==null){
        return;
    }
    queue.offer(root);
    while (!queue.isEmpty()){
        Node temp = queue.poll();
        System.out.print(temp.data + " ");
        if (temp.left !=null){
            queue.offer(temp.left);
        }if (temp.right !=null){
            queue.offer(temp.right);
        }
    }

}

public int findMax(Node root){
    if (root ==null){
        return  Integer.MIN_VALUE;
    }

    int result = root.data;
    int left = findMax(root.left);
    int right = findMax(root.right);
    if (left > result){
        result = left;
    } if (right > result){
        result = right;
    }
    return result;

}

public class Node{
    Node left;
    Node right;
    int data;

    public Node( int data){
this.data=data;
    }

}



}
