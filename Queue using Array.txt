class Queue{
    static int size=7,front=0,rear=0;
    int q[]=new int[size];
    boolean isFull(){
        return rear==size;
    }
    void enQueue(int d){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            q[rear]=d;
            rear++;
        }
    }
    boolean isEmpty(){
        return rear==0;
    }
    int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int val=q[front];
        for(int i=1;i<rear-1;i++){
            q[i-1]=q[i];
        }
        rear--;
        q[rear]=0;
        return val;
    }
    void display(){
        for(int i=0;i<rear;i++){
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
       Queue que=new Queue();
       que.enQueue(10);
       que.enQueue(20);
        que.enQueue(30);
         que.enQueue(40);
         que.display();
         que.deQueue();
         que.display();
	}
}
