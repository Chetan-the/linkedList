class node{
    int head;
    node next;
    public node(int head,node next){
        this.head=head;
        this.next=next;
    }
}
public class middlenode {
    public node findmiddlenode(node head){
        //return the middle node of a linkedlist
        //using tortoise method by keeping the slow and fast if fast moves to null then slow tortoise where it is pointing is the middle node of a linked list
        
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    
}
