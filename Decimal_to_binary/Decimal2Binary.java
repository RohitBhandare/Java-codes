package Decimal_to_binary;

public class Decimal2Binary {
    public static void bin(int a)
    {
        int arr[]=new int[10];
        int index=0;
        while(a!=0)
        {
            arr[index++]=a%2;
            a=a/2;
        }
        for(int i=index-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }

    }
    public static void main(String[] args) {
        //System.out.println(2%2);
        bin(10);

    }
}
