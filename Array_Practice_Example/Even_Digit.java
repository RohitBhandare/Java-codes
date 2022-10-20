package Array_Practice_Example;

public class Even_Digit {
    public static void main(String[] args) {
        int array[] = {1, 22, 333, 4444, 55555, 666666, 3333};
        System.out.println(findno(array));
    }
    static  int numofdigit(int num)
    {
      int count=0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        System.out.println(count);
        return count;


    }
       static int findno(int array[])
       {
           int result=0,even=0;
           for(int i=0;i< array.length;i++)
           {
               result=array[i];
               if(numofdigit(result)%2==0)
               {
                   even++;
               }

           }
          return even;
       }


}
