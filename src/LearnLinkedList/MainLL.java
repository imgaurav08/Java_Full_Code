package LearnLinkedList;

public class MainLL {
    public static void main(String[] args) {
        SingleLL ll = new SingleLL();
        ll.insertFirst(4);
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(2);
        ll.insertFirst(9);
        ll.insertFirst(1);
        ll.insertFirst(1);
        ll.display();
        System.out.println();
        System.out.println(" Adding last ");
        ll.insertLast(5);
        ll.insertLast(6);
        ll.display();
        System.out.println();
        System.out.println(" Adding Middle ");
        ll.insert(25,4);
        ll.display();
        System.out.println();
        System.out.println(" Delete First ");
        ll.deleteFirst();
        ll.display();

        System.out.println();
        System.out.println(" Delete last ");

        ll.deleteLast();
        ll.display();

        System.out.println();
        System.out.println(" Delete Index ");

        ll.deleteAt(3);
        ll.display();

        System.out.println();
        System.out.println(" Remove duplicate  ");

        ll.removeDuplicate();
        ll.display();

        System.out.println();
        System.out.println(" Reverse  ");

        ll.reverse();
        ll.display();
    }
}
