package Thread;

class A implements Runnable
{
    public void run() {
        int i=0;
        while(i<=10)
        {
            System.out.println("Thread A: "+i);
            i++;
        }
    }
}
class B implements Runnable
{
    public void run() {
        int i=0;
        while(i<=10)
        {
            System.out.println("Thread B: "+i);
            i++;
        }
    }
}
public class Threading {
    public static void main(String[] args)
    {
        System.out.println("Threading ...............");
        A obj=new A();
        Thread t1=new Thread(obj);
        B obj2=new B();
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
    }
}
