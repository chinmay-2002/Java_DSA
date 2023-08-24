package linkedlist;

public class Node {
    public int data;
    public Node next;

    public Node(int val){
        this.data = val;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
