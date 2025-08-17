package Linked_list.Singly_LL;

public class singlyLL {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        node head=null;
        node tail=null;
        void insertAtEnd(int data){
            node temp = new node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtBegning(int data){
            node temp=new node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAtIdx(int data,int idx){
            node newnode= new node(data);
            node temp=head;
            if(idx==1){
                insertAtBegning(data);
                return;
            }
            else if(idx==size()){
                insertAtEnd(data);
                return;
            }
            else{
                while(temp.next!=null){
                    temp=temp.next;
                    idx--;
                    if(idx==1){
                        newnode.next=temp.next;
                        temp.next=newnode;
                    }
                }
            }
        }
        int get(int idx){
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
                idx--;
                if(idx==1){
                    return temp.data;
                }
            }
            return -1;
        }
        int size(){
            node temp=head;
            int cnt=0;
            while(temp!=null){
                temp=temp.next;
                cnt++;
            }
            return cnt;
        }
        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(7);
        ll.insertAtBegning(2);
        ll.display();
        System.out.println();
        ll.insertAtIdx(2, 3);
        ll.display();
        System.out.println(ll.get(3));
    }
}
