package Trees;

public class BinarySearchTreeEg {

    public Node root;

    public void insert(int value){
        root =insert(root,value);
    }

    public Node insert(Node root, int value){
        if (root ==null){
            root = new Node(value);
            return root;
        }
        if (value < root.data){
            root.left = insert(root.left,value);
        }else {
            root.right = insert(root.right,value);
        }
        return root;
    }

    public void display(){
        display(root);
    }

    public void display(Node root){
        if (root ==null){
            return;
        }
        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }

    public class Node{
        Node left;
        Node right;
        int data;

        public Node(int data){
            this.data=data;
        }

    }

    public static void main(String[] args) {
        BinarySearchTreeEg bt = new BinarySearchTreeEg();
        bt.insert(1);
        bt.insert(7);
        bt.insert(3);
        bt.insert(2);
        bt.insert(9);
        bt.display();
    }

}
