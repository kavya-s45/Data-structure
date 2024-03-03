class Node{
    int data;
    Node next;
    Node prev;
    
    public Node(int d){
        data=d;
        prev=null;
        next=null;
    }
}
class Doublylinkedlist{
   Node head=null;
   static int size=0;
   void insert_end(int d){
       Node node=new Node(d);
       if(head==null){
           head=node;
       }
       else{
           Node temp=head;
           while(temp.next!=null){
               temp=temp.next;
           }
           temp.next=node;
           node.prev=temp;
       }
       size++;
   }
   void display(){
       Node temp=head;
       while(temp!=null){
           System.out.print(temp.data + "->");
           temp=temp.next;
       }
       System.out.println("null");
       size++;
   }
   void insert_front(int d){
       Node node=new Node(d);
       if(head==null){
           head=node;
       }
       else{
           node.next=head;
           head.prev=node;
           head=node;
       }
       size++;
   }
   void insert_index(int d,int index){
       if(index==0){
           insert_front(d);
       }
       else if(index>=size){
           insert_end(d);
       }
       else{
           int i=1;
           Node temp=head;
           Node node=new Node(d);
           while(i<index){
           i++;
           temp=temp.next;
       }
       node.next=temp.next;
       temp.next.prev=node;
       temp.next=node;
       node.prev=temp;
       size++;
   }
}
void reverse(){
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.prev;
    }

    System.out.println("null");
}
void delete_first(){
    if(head!=null){
        if(head.next==null){
            head=null;
        }
        else{
            Node temp=head.next;
            temp.prev=null;
            head.next=null;
            head=temp;
        }
        size--;
    }
}
void delete_last(){
    if(head!=null){
        if(head.next==null){
            head=null;
        }
        else{
            Node temp=head;
            while(temp.next!=null&&temp.next.next!=null){
                temp=temp.next;
            }
            temp.next.prev=null;
            temp.next=null;
        }
        size--;
    }
}
}
public class Main
{
	public static void main(String[] args) {
		Doublylinkedlist dll=new Doublylinkedlist();
		dll.insert_end(100);
		dll.insert_end(200);
		dll.insert_end(300);
		dll.insert_end(400);
		dll.display();
		dll.insert_front(500);
		dll.display();
		dll.insert_index(600,3);
		dll.display();
		dll.reverse();
		dll.display();
		dll.delete_first();
		dll.display();
		dll.delete_last();
		dll.display();
	}
}
                                                                               