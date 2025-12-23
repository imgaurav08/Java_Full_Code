package LeetCodeQuestions.src.com.Gaurav;


public class RemoveDuplicateFromLL {
    static Node head;

    static Node tail;
    private class Node{
        private int value;
        private Node next;



        public Node(int value) {
            this.value = value;
            this.next=null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int value){
        Node newNode = new Node(value);
        if (head==null){
            head= newNode;
            return;
        }
        newNode.next=head;
        head= newNode;
    }

    public void addLast(int value){

        Node node = new Node(value);
        if (head==null || head.next==null){
            head = node;
        }
        Node temp= head;
        while (temp.next!=null){
       temp=temp.next;
        }
        temp.next=node;

    }

    public void removeDuplicate(){
       Node node =head;
       while (node.next!=null){
           if (node.value == node.next.value){
             node.next=  node.next.next;
           }else {
               node=node.next;
           }
       }
       tail=node;
       tail.next=null;

    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value + "--->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }



}
