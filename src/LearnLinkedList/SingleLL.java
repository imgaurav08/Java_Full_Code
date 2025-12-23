package LearnLinkedList;

public class SingleLL {

    private Node head;

    public void insertFirst(int val){
      Node node = new Node(val);
      node.next=head;
      head=node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
       if (head==null) {
           insertFirst(val);
       }
        Node temp=head;
       while (temp.next!=null){
           temp=temp.next;
       }
       temp.next=node;
    }

    public void insert(int val,int index){
        if (head==null){
            insertFirst(val);
            return;
        }
        Node temp = head;
        for (int i =0; i < index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
    }

    public void display(){
      Node temp = head;
      while (temp!=null){
          System.out.print(temp.value + " ---> ");
          temp=temp.next;
      }
        System.out.println(" END ");
    }

    public void deleteFirst(){
      if (head ==null){
          System.out.println(" List is empty");
      }
      head=head.next;
    }

    public void deleteLast(){
        if (head.next==null){
            head=null;
        }
        if (head==null){
            System.out.println("List is empty");
        }

        Node tem= head;
        while (tem.next.next!=null){
            tem=tem.next;
        }
        tem.next=null;
    }

    public void deleteAt(int index){
        Node temp=head;
     for (int i=0; i < index;i++){
         temp=temp.next;
     }
     temp.next=temp.next.next;
    }

    public void removeDuplicate(){
     Node temp = head;
     while (temp.next!=null){
         if (temp.value == temp.next.value){
             temp.next =temp.next.next;
         }else {
             temp= temp.next;
         }
     }
    }

    public boolean hasCycle(Node head) {
        Node first = head;
        Node second = head;
        while (first != null && first.next!=null){
            first =first.next.next;
            second=second.next;
            if (first ==second){
                return true;
            }
        }
        return false;

    }

//    public void reverse(){
//        Node prev=null;
//        Node present = head;
//        Node next= present.next;
//        while (present!=null){
//            present.next=prev;
//            prev=present;
//            present=next;
//            if (next!=null){
//                next=next.next;
//            }
//        }
//        head=prev;
//    }

    public void reverse(){
        Node previous =null;
        Node present = head;
        Node next = present.next;
        while (present !=null){
            present.next=previous;
            previous = present;
            present= next;
            if (next!=null){
                next =next.next;
            }
        }
        head=previous;
    }

    public void rotateList(Node head, int k){
        if (k<=0|| head==null|| head.next==null){
            return;
        }

        Node last =head;
        int length=1;
        while (last.next!=null){
            last=last.next;
            length++;
        }
        int rotation = k%length;
        int skip = length-rotation;
        Node lastNode=head;
        for (int i=0;i<skip-1;i++){
            lastNode=lastNode.next;
        }
        head=lastNode.next;
        lastNode.next=null;

    }



    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

}
