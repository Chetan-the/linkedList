class node{
    int data;
    node next;
    public node(int data,node next){
        this.data=data;
        this.next=next;
    }
    public node(int data){
        this.data=data;
        this.next=null;
    }
}
public class addtwonumbers {
    
    //given two linked lists and we have to sum the two linkedlists and return the head of the node
    public node addlinkedlists(node list1,node list2){
        node l1=list1;
        node l2=list2;
        node dummynode=new node(-1);
        node temp=dummynode;
        int carry=0;
        
        while(l1!=null || l2!=null || carry==1 ){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;

            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;

            }
            sum+=carry;
            int mod=sum%10;
            carry=mod/10;
            node newnode=new node(mod);
            temp.next=newnode;
          temp=temp.next;
        }
        




        
        return dummynode.next;
        

    }

}
