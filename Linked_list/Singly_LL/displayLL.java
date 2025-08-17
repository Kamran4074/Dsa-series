package Linked_list.Singly_LL;

public class displayLL {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static int size(node head){
        int cnt=0;
        node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
    }
    public static void displayrevers(node head) {
        if(head == null) {
            return;
        }
        displayrevers(head.next);
        System.out.print(head.data + " -> ");
    }
    public static void insertatend(node head,int data){
        node n= new node(data);
        while(head.next!=null){
            head=head.next;
        }
        head.next=n; // Insert the new node at the end
        n.next = null; // Ensure the new node's next is null
    }
    public static void main(String[] args) {
        node a= new node(6);
        node b= new node(9);
        node c= new node(3);
        node d= new node(8);
        node e= new node(0);
        a.next=b;
        b.next=c;   
        c.next=d;
        d.next=e;

        display(a);
        System.out.println("\nSize of the linked list: " + size(a));
        // System.out.print("\nReversed display: ");
        // displayrevers(a);
        System.out.println("\nInserting "+ 5 + " at end:");
        insertatend(a, 5);
        display(a);
        System.out.println("\nSize of the linked list: " + size(a));
    }
}
