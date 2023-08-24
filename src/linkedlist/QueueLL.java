package linkedlist;

public class QueueLL {
    QNode front, rear;
    public QueueLL(){
        this.front = this.rear = null;
    }
    void enqueue(int key){
        QNode temp = new QNode(key);
        if(temp==null){
            System.out.println("Heap overflow...!");
        }
        if (this.rear ==null ){
            this.front = this.rear = temp;
            return ;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
    void dequeue(){
        if(this.front == null){
            return ;
        }
        QNode temp = this.front;
        this.front = this.front.next;
        if (this.front==null){
            this.rear=null;
        }
    }

}
