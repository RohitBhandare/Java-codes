class nodex
{
    int data;
    nodex next;
    nodex prev;
    nodex(int val)
    {
        data=val;
        this.next=null;
        this.prev=null;
    }

}
public class Doubly_LinkedList {
    nodex head;
    void insert(int data)
    {
        nodex newnode=new nodex(data);

        if(head==null)
        {
            head=newnode;
            return;
        }
        nodex curr=head;
       while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=newnode;
        newnode.prev=curr;
    }
   void display()
    {
        nodex p=head;
        nodex temp=p;
        System.out.print("LinkedList Forward: ");
        System.out.print(" null <-> ");
        while(p!=null)
        {
            System.out.print(" "+p.data+" <->");
            temp=p;
            p=p.next;
        }
        System.out.print(" null");
        System.out.print("\nLinkedList Reverse: ");
        System.out.print(" null <-> ");
        while(temp!=null)
        {
            System.out.print(" "+temp.data+" <->");
            temp=temp.prev;
        }
        System.out.print(" null");
    }
    void delete(int data)
    {
        nodex temp=head;
        while(temp.data!=data)
        {
            temp=temp.next;
        }

        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
    }
    void search(int key)
    {
        nodex temp=head;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                System.out.println("\nElement "+temp.data+" found..");
                break;
            }
            else if(temp.next==null)
                System.out.println("\nElement "+key+" Not found...");
            temp=temp.next;
        }

    }
    public static void main(String [] args)
    {
        System.out.println(".......Doubly Linked list.........");
        Doubly_LinkedList obj=new Doubly_LinkedList();
        nodex head=null;
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(60);
        obj.delete(30);
        obj.delete(20);
        obj.delete(40);

        obj.display();
        obj.search(60);


    }
}
