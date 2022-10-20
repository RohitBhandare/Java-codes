package String_Palindrome;

import java.util.HashMap;
import java.util.*;
public class Character_Count_Occurance {
    public static void main(String[] args) {
        String str="MET Institute of Engineering";
        char charaar[]=str.toCharArray();
        int array[]=new int[127];
        int max=0;
        char ans='\0';
        Map <Character,Integer>map=new HashMap<>();
        for(int i=0;i<charaar.length;i++)
        {
            array[charaar[i]]+=1;

            if(max<array[charaar[i]])
            {
                max=array[charaar[i]];
                ans=charaar[i];
            }
        }
        if(max!=1) {
           System.out.println(max);
           System.out.println(ans);
        }
        else
            System.out.println("all character are unique");
    }
}
