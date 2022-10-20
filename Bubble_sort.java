
import java.util.Scanner;
class sort
{
    public void get()
    {
        int arry[]=new int[5],i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value: ");
        for(i=0;i<5;i++)
        {

            arry[i]=sc.nextInt();

        }
        System.out.println("Entered Elements: ");
        for(i=0;i<5;i++)
        {
            System.out.print(" "+arry[i]);

        }
        System.out.println("\n");
        for(i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(arry[j]>arry[j+1])
                {
                    int temp=arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array: ");
        for(i=0;i<5;i++)
        {
            System.out.print(" "+arry[i]);

        }

    }
}
class Bubble_sort
{
    public static void main(String[] args)
    {
        System.out.println("Bubble sort");
        sort obj=new sort();
        obj.get();
    }
}
/* .................OUTPUT......................
Bubble sort
Enter Value: 50
40
30
20
10
Entered Elements:
 50 40 30 20 10

Sorted Array:
 10 20 30 40 50
 ....................................................*/