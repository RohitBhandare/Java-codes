package java_Anonymous_class;
class Aa
{

    void display()
    {
        System.out.println("hello");
    }
}
public class Anonymous_class {
    public static void main(String[] args) {
        Aa obj=new Aa()
        {
            @Override
            void display() {
                System.out.println("yeah");
            }
        };
        obj.display();

    }
}
