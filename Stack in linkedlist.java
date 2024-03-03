class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}
class stack{
    Node top=null;
    static int size=0;
    void push(int d){
        Node node=new Node(d);
        if(top==null){
            top=node;
        }
        else{
            node.next=top;
            top=node;
        }
        size++;
    }
    
    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=top.data;
        top=top.next;
        size--;
        return val;
    }
    void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    int peek(){
        if(isEmpty()){
            return -1;
        }
        int val=top.data;
        return val;
    }
}
public class Main
{
	public static void main(String[] args) {
		stack st=new stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.display();

		System.out.println("popped elements is:" + st.pop());
		
		st.display();
		System.out.println("peeked elements is:" + st.peek());
		st.display();
		
	}
}
