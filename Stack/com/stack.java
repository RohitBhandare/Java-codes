package Stack.com;

public class stack {
    public int stk[]=new int[5];
    int top=-1;
    int size=5;
    int full()
    {
        if(top==size-1)
        {
            return 1;
        }
        return 0;
    }
   void push(int val)
    {
        if(full()==1)
        {
            System.out.println("Stack is Overflow.....!!!!");
        }
        else {
            top++;
            stk[top] = val;
            System.out.println("Pushed: " + stk[top]);
            System.out.println("Top: " + top);
        }
        System.out.println("Stack: ");
        for(int i=0;i<size-1;i++)
        {
            System.out.print(" "+stk[i]);
        }
        System.out.println("\n");
    }
    void pop()
    {
        System.out.println("popped: "+stk[top]);
        top--;
    }
    public static void main(String[] args)
    {
        System.out.println("stack....");
        stack obj=new stack();
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(40);
        obj.push(50);
        obj.push(50);




    }
}
