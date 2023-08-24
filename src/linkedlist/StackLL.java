package linkedlist;

public class StackLL {
    static int count = 0;
    static int size = 5;

    public Node push(Node head, int data){
        if(count==5){
            System.out.println("Overflow Condition...!");
            return head;
        }
        System.out.println("Inserted element :" + data);
        count++;
        if(head==null){
            return new Node(data);
        }
        Node n = new Node(data);
        n.next = head;
        head = n;
        return head;
    }
    public Node pop(Node head){
        if(count==0){
            System.out.println("Underflow COndition..!");
            return head;
        }
        count--;
        System.out.println("Popped element is :" + head.data);
        head = head.next;
        return head;
    }
    public void isEmpty(Node head){
        if(count==0){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }
    public void isFull(Node head){
        if(count==5){
            System.out.println("Stack is full");
        }
        else{
            System.out.println("Stack is not full");
        }
    }

    public void displayStack(Node head){
        if(head ==null || count==0) {
            System.out.println("Empty Linkedlist Stack...!");
            return;
        }
        System.out.println("Stack is Printing...!");
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + "->" + temp.next);
            temp = temp.next;
        }
    }

}
