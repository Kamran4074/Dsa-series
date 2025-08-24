package Linked_list.Singly_LL;

public class doublyLinkedList {
    class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    static node head=null;
    static node tail=null;
    static int size=0;
    void insertAtEnd(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
        size++;
    }
    void insertAtBegning(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
        size++;
    }    
    void insertAtIdx(int data,int idx){
        node newnode=new node(data);    
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0){
            insertAtBegning(data);
            return;
        }
        else if(idx==size){
            insertAtEnd(data);
            return;
        }
        else{
            node temp=head;
            while(temp!=null && idx>1){
                temp=temp.next;
                idx--;
            }
            newnode.next=temp.next;
            newnode.prev=temp;
            if(temp.next!=null){
                temp.next.prev=newnode;
            }
            temp.next=newnode;
            size++;
        }
    }
    int get(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
            return -1;
        }
        node temp=head;
        while(temp!=null && idx>0){
            temp=temp.next;
            idx--;
        }
        return temp.data;
    }
    int size(){
        return size;
    }
    void display2(node random){
        if(random==null){
            return;
        }
        node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        display();
    }
    void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }   
    public static void main(String[] args) {
        System.out.println("Doubly Linked List");
        doublyLinkedList dll=new doublyLinkedList();
        dll.insertAtEnd(10);    
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.display();
        dll.insertAtBegning(5);     
        dll.display();
        dll.display2(head);
    }
}
