package linkedlist.com;

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
public class linkedlist {
    node head=null;
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
    void delete(int val)
    {
        node p=head;
        node r=head;
        while(p.data!=val)
        {
            r=p;
            p=p.next;
        }
        System.out.println(p.data);
        r.next=p.next;
        p=null;
    }

    public static void main(String[] args)
    {
        System.out.println("Linked List");
        linkedlist obj=new linkedlist();
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        obj.addfirst(10);
        obj.delete(40);

        obj.show();
    }
}
