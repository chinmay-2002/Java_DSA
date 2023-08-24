package linkedlist;

public class Operations {

//    Insertion operation
    public Node insert(Node head, int data){
        Node n = new Node(data);
        if(head==null){
            return n;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
        return head;
    }

    public Node insertAtHead(Node head, int data){
        Node n = new Node(data);
        if(head==null) {
            return n;
        }
        n.next = head;
        head = n;
        return head;
    }

//    Delete head node
    public Node deleteHead(Node head){
        return head.next;
    }

//    Displaying linkedlist
    public void display(Node head){
        System.out.println("Linked list is :");
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + "->" + temp.next);
            temp = temp.next;
        }
    }

    /**
     * Merge Two Sorted Linked List
     * @param head1
     * @param head2
     * @return head
     */
    public Node mergeSortedLinkedList(Node head1, Node head2){

        // bases cases
        if(head1==null)
            return head2;
        else if(head2==null)
            return head1;



        Node current = head1.data > head2.data ? head2 : head1;
        Node cursor = head1.data > head2.data ? head1 : head2;
        Node head = current;
        while(current.next !=null && cursor != null){
            if(current.next.data < cursor.data){
                current = current.next;
            }
            else if(current.next.data > cursor.data){
                Node temp = current.next;
                current.next = cursor;
                cursor = temp;
            }
            else {
                current = current.next;
            }
        }
        if(current.next == null)
                current.next = cursor;
        return head;
    }

    /**
     * Reverse A linked list
     */

    public Node reverseLinkedList(Node head){

        System.out.println("Linkedlist In Reverse Operations :");

        if(head==null || head.next == null)
            return head;

        Node tail = null;
        Node front = head.next;

        while (front!=null){
            head.next = tail;
            tail = head;
            head = front;
            front = front.next;
        }
        head.next = tail;
        return head;
    }

    /**
     * Reverse Linkedlist in a group of K nodes and stay last nodes which cant have group
     * k as it is
     * .........
     *
     */



}
