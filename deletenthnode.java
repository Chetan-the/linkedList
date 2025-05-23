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
public class deletenthnode {
    //given a head we have to remove the nth node from the end 
    //brute force solution was 
    public node deletenode(node head,int n){
        //here is the what is the node that we have to remove it from the end
        node temp=head;
        int cnt=0;
        //cnt the length of the node
        while(temp!=null){
            cnt++;
            temp=temp.next;   
        }
        if(cnt==n){
            //remove the head
            node newhead=head.next;
            head=null;
            return newhead;
        }
        int res=cnt-n;
        //we have to remove the res node 
        //so we have to find the position of the temp node
        temp=head;
        while(temp!=null){
            res--;
            if(res==0){
                break;
                //here we have to remove the next node of this temp
                //this is nth node from the last
            }
            temp=temp.next;
        } 
        node newnode=temp.next;
        temp.next=temp.next.next;
        newnode=null;
        return head;
        //tc-o(2n)
        //sc-o(1)


    }
    //optimal solution was by using slow and fast pointer
    public node removenodebylast(node head,int n){
        int cnt=0;
        node slow=head;
        node fast=head;
      for(int i=0;i<n;i++){
        fast=fast.next;
        if(fast==null){
        return head.next;
      }
       while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
       }
       node newnode=slow.next;
       slow.next=slow.next.next;
       newnode=null;
     
      }
      return head;
      
        
    }

    
}
