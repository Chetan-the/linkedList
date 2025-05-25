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
public class deletenode{
    //instead of given tne head they just given the node directly which have to be deleted
    public void deletenodde(node remove){
      
        node nextnode=remove.next;
          int value=nextnode.data;
          nextnode=null;

        remove=new node(value);

        

    }

}