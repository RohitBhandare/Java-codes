import java.util.Scanner;
class Test
{
    public int a ,b;
    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        a=sc.nextInt();
        System.out.println("Enter second element");
        b=sc.nextInt();
    }

}
class Child extends Test
{
    public void display()
    {
        System.out.println("Addition: "+(a+b));
    }

}
class java_inheritance {
    public static  void main(String[] args)
    {
        System.out.println("\nJava");
        Test obj = new Test();
        Child ob=new Child();
        obj.getdata();
        ob.display();
    }
}
