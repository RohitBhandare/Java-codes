package Array_Practice_Example;

import java.util.Collections;

public class Zeros_To_Right {
    public static void main(String[] args) {
        int array[]={1,2,0,3,4,0,6,0};  //{1,2,3,4,0,0,0}
        int j=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]!=0)
            {
               int temp=array[j];
               array[j]=array[i];
               array[i]=temp;
               j++;

            }
        }
       for(int i=0;i<array.length;i++)
       {
           System.out.print(array[i]);
       }
    }
}
