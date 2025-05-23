public class node {
    int data;
    node next;
    public node(int data,node next){
        this.data=data;
        this.next=next;

    }
    node(int data){
        this.data=data;
        this.next=null;
    }
    //they given the head of the node we have to reverse the linkedlist and return the answer
    //in here we are just simply reversing the links of the nodes
    public node reverseList(node head){
        node newhead=null;
        while(head!=null){
            node next=head.next;
            head.next=newhead;
            newhead=head;
            head=next;
        }
        return newhead;

    }
    
}
