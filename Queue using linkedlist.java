class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}
class Queue{
    Node front=null,rear=null;
    static int size=0;
    void enQueue(int d){
        Node node=new Node(d);
        if(front==null){
            front=node;
            rear=node;
        }
        else{
            rear.next=node;
            rear=rear.next;
        }
        size++;
    }
    void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    boolean isEmpty(){
        return front==null;
    }
    int deQueue(){
        if(isEmpty()){
            return -1;
        }
        int val=front.data;
        front=front.next;
        size--;
        return val;
    }
}
public class Main
{
	public static void main(String[] args) {
	  Queue que=new Queue();
	  que.enQueue(10);
	  que.enQueue(20);
	  que.enQueue(30);
	  que.display();
	  System.out.println("Removed element is:" + que.deQueue());
	  que.display();
	}
}
