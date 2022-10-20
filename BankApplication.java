import java.util.*;
class Deposit
{
    int amt=0;
    void Deposit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a amount do you want to deposit: ");
        amt=sc.nextInt();
        System.out.println("Rs."+amt+" Credited in your account successfully...");
        System.out.println("Your current balance: "+amt);
    }
}
class Withdraw extends Deposit
{
    int wd=0;
    void Withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount do you want to WITHDRAW: ");
        wd=sc.nextInt();
        System.out.println(wd+" Amount withdraw successfully..");
        System.out.println("Current Balance: "+(amt-wd));
    }
}
public class BankApplication {
    public static void main(String[] args)
    {
        Withdraw client1=new Withdraw();
        client1.Deposit();
        client1.Withdraw();
    }
}
/* OUTPUT
Enter a amount do you want to deposit: 2000
Rs.2000 Credited in your account successfully
Your current balance: 2000
Enter Amount do you want to WITHDRAW:
200
200 Amount withdraw successfully..
Current Balance: 1800

Process finished with exit code 0
 */