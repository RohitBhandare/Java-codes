package java_Anonymous_class;
interface A
{
    void display();
}
public class Java_Lambda_Expression {
    public static void main(String[] args) {
        A obj =() -> { System.out.println("Hello World"); };

        obj.display();
    }
}

