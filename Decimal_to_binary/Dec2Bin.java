package Decimal_to_binary;

public class Dec2Bin {
    public static void main(String[] args) {
        //System.out.println((int) Math.pow(2,2));
        int n=5,ans=0,i=0;
        while(n!=0)
        {
            int bit=n&1;
            ans=(bit*(int) Math.pow(10,i)+ans);
            n=n>>1;
            i++;
        }
        System.out.println(ans);
    }
}
