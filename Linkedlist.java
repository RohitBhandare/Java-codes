
class node
{
    int data;
    node next;
    node(int val)
    {
        this.data=val;
        this.next=null;
    }
}
public class Linkedlist {
    node head;

    public  void addfirst(int data)
    {
        node Newnode=new node(data);
        if(head==null) {
            head = Newnode;
            return;
        }
        Newnode.next=head;
        head=Newnode;

    }
    public void add(int data)
    {
        node Newnode=new node(data);
        if(head==null)
        {
            head=Newnode;
            return;
        }
       node currnode=head;
        while(currnode.next!=null)
        {
            currnode=currnode.next;
        }
        currnode.next=Newnode;

    }
    public void show()
    {
        node currnode=head;
        if(currnode==null)
        {
            return;
        }
        while(currnode!=null)
        {
            System.out.print(currnode.data+" -> ");
            currnode=currnode.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args)
    {
        System.out.println("Linked List");
        Linkedlist obj=new Linkedlist();
        obj.add(30);
        obj.add(40);
        obj.addfirst(20);
        obj.show();
    }
}
