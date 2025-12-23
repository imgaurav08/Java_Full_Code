package LeetCodeQuestions.src.com.Gaurav;

public class MergeTwoSortedList {
    static Node head;

    private   class  Node{
        private int value;
        private  Node next;

        public Node(int value) {
            this.value = value;
            this.next=null;
        }
    }

    public void addLast(int value){
        Node newNode = new Node(value);
        if (head==null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }


    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value + "--->");
            temp=temp.next;
        }
    }

    public static MergeTwoSortedList merge(MergeTwoSortedList first,MergeTwoSortedList second){
        Node f = first.head;
        Node s = second.head;

        MergeTwoSortedList LL = new MergeTwoSortedList();

        while (f!=null && s!=null){
            if (f.value < s.value){
                LL.addLast(f.value);
                f=f.next;
            } else{
                LL.addLast(s.value);
                s=s.next;
            }
        }

        while (f!=null){
            LL.addLast(f.value);
            f=f.next;
        }
        while (s!=null){
            LL.addLast(s.value);
            s=s.next;
        }

        return LL;

    }

}
