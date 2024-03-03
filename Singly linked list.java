class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
        next=null;
    }
}
class linkedlist{
    Node head=null;
    static int size = 0;
    void insert_end(int d){
        Node node = new Node(d);
        if(head == null){
            head = node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void insert_first(int d){
       
        Node node=new Node(d);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
        size++;
    }
    void insert_index(int d,int index)
    {
        if(index==0)
        {
            insert_first(d);
        }
                else if(index>=size)
                {
                    insert_end(d);
                }
                else
                {
                    int i=1;
                    Node temp = head;
                    Node node=new Node(d);
                    while(i<index&&temp.next!=null)
                    {
                        i++;
                        temp=temp.next;
                    }
                    node.next=temp.next;
                    temp.next=node;
                    size++;
                }
            }
    void delete_first(){
        if(head!=null)
        {
            head=head.next;
            size--;
        }
    }
               
void delete_last(){
    if(head!=null){
        if(head.next==null){
           delete_first();
        }
        else{
            Node temp=head;
            while(temp.next!=null && temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
             size--;
        }
    }
}
void delete_index(int index)
           {
           if(index<size)
           {
           if(index==0)
           {
                delete_first();
           }
           else if(index==size-1)
           {
                delete_last();
           }
           else
           {
                Node temp=head;
                int i=1;
                while(i<index && temp.next!=null)
           {
                i++;
                temp=temp.next;
           }
                temp.next=temp.next.next;
                size--;
           }
           }
           }
        }
   

public class Main
{
public static void main(String[] args) {
    linkedlist ll = new linkedlist();
    ll.insert_end(10);
    ll.insert_end(20);
    ll.insert_end(30);
    ll.insert_first(100);
    ll.display();
    ll.insert_index(17,2);
    ll.display();
    ll.delete_first();
    ll.display();
    ll.delete_last();
    ll.display();
    ll.delete_index(1);
    ll.display();
}
}