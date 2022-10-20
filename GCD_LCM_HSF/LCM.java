package GCD_LCM_HSF;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
      //  int a=12,b=18;  //Least Common Multiplier     12=24,36   18=36,54  36 is the LCM
        int a=0,b=0;
        System.out.print("Enter a Value of a & b : ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b= sc.nextInt();
        int lcm;
        for(lcm=Math.max(a,b);lcm<a*b;lcm++)
        {
            if(lcm%a==0 && lcm%b==0)
                break;
        }
        System.out.println("LCM of "+a+" & "+b+" is: "+lcm);
    }
}
