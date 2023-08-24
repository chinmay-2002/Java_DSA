package linkedlist;

public class LinkedlistMain {
    public static void main(String[] args) {

/*        Normal linked list                  */

        Operations op = new Operations();
        Node head1 = null;
        head1 = op.insert(head1, 1);
        head1 = op.insert(head1, 1);
        head1 = op.insert(head1, 1);
        head1 = op.insert(head1, 200);
        head1 = op.insert(head1, 2799);
        head1 = op.insertAtHead(head1, -90);

//        op.display(head1); // display linkedlist


        Node head2 = null;
        head2 = op.insert(head2, 1376);
        head2 = op.insert(head2, 1327889);
        head2 = op.insert(head2, 21238790);
        head2 = op.insert(head2, 343458787);
        head2 = op.insert(head2, 1008097787);
        head2 = op.insertAtHead(head2, 10);
//        op.display(head2);
         // display linkedlist

        op.display(op.reverseLinkedList(head1));



        Node newHead = op.mergeSortedLinkedList(head1, head2);

        op.display(newHead);
        op.display(op.reverseLinkedList(newHead));
//        op.display(head1);
//        op.display(head2);

















        /*      Stack using linkedlist           */

//        StackLL st = new StackLL();
//        Node head = null;
//        head = st.push(head, 10);
//        head = st.push(head, 20);
//        head = st.push(head, 30);
//        head = st.push(head, 40);
//        head = st.push(head, 50);
//        head = st.push(head, 50);
//        head = st.push(head, 50);
//        head = st.push(head, 50);
//        head = st.push(head, 50);
//        head = st.push(head, 60);
//        head = st.pop(head);
//        head = st.pop(head);
//        head = st.pop(head);
//        head = st.pop(head);
//        head = st.pop(head);
//        head = st.push(head, 50);
//
//        st.displayStack(head);

//    QueueLL q = new QueueLL();
//        q.enqueue(10);
//        q.enqueue(20);
//        q.enqueue(130);
//        q.enqueue(14);
//        q.enqueue(15);
//        q.enqueue(106);
//        q.enqueue(107);
//
//        System.out.println(q.front.data);
//        System.out.println(q.rear.data);

    }
}
