package Java_Strings;

import java.util.Collections;
import java.util.Scanner;

public class Reverse_String_Inplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String: ");
        char array[]=sc.next().toCharArray();
        int first=0;
        int last=array.length-1;
        for(int i=0;i< array.length;i++)
        {
            while(first<last) {
                char a = array[first];
                array[first] = array[last];
                array[last] = a;
                first++;
                last--;
            }
        }
        System.out.println(array);

    }
}
