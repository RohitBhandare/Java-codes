import java.util.*;
//Number guessing Game............
public class Random_num {
    public static void main(String[] args)
    {
        int random=(int)(Math.random()*100);

        Scanner sc=new Scanner(System.in);
        int num=0;
        do
        {
            System.out.println("Enter a Number: ");
            num=sc.nextInt();
            if(num==random) {
                System.out.println("Congratulations!! you're Genius..");
                break;
            }
            else if(num>random)
            System.out.println("Number it too big..");
            else
                System.out.println("Number is to small...");
        }
        while(num>=0);
        System.out.println("Number was: "+random);
    }
}
