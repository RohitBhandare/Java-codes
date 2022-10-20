package Lower_to_upper_case;

import java.util.Scanner;

public class Upper_To_Lower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A string in Upper case: ");
        char array[]=sc.next().toCharArray();
        for(int i=0;i< array.length;i++)
        {
            if(array[i]>='A' && array[i]<='Z')
            {
                array[i]= (char) (array[i]+32);
            }
        }
        System.out.println(array);


    }
}
