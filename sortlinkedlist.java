import java.util.*;
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
public class sortlinkedlist {
    //given two sorted linkedlists we have to merge the linkedlists and retunr the answer
    public node convertarrtolinkedlist(ArrayList<Integer> arr){
        node dummynode=new node(-1);
        node temp=dummynode;
        for(int i=0;i<arr.size();i++){
            temp.next=new node(arr.get(i));
            temp=temp.next;

        }
        return dummynode.next;

    }
    public node sorttwolinkedlist(node list1,node list2){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        node temp1=list1;
        node temp2=list2;
        while(temp1!=null){
            arr.add(temp1.data);
            temp1=temp1.next;
            
        }
        while(temp2!=null){
            arr.add(temp2.data);
            temp2=temp2.next;

        }
        Collections.sort(arr);
        node head=convertarrtolinkedlist(arr);
        return head;
    }
    //optimal solution was
    public node mergenodes(node list1,node list2){
        node dummynode=new node(-1);
        node temp=dummynode;
        while(list1!=null && list2!=null){
            if(list1.data<=list2.data){
                temp.next=list1;
                list1=list1.next;

            }
            else{
temp.next=list2;
            list2=list2.next;
            }
            temp=temp.next;


           
            
            


        }
        
            if(list1!=null){
                temp.next=list1;
            }
            else{
                  temp.next=list2;

            }
          
         return dummynode.next;
       

    }
    
}
