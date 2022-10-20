package Lower_to_upper_case;
import java.util.*;
public class Lower_To_Upper {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Name: ");
        char arry[]=sc.next().toCharArray();
        for(int i=0;i< arry.length;i++) {
            if(arry[i]>='a'&& arry[i]<='z') {
                arry[i] = (char) (arry[i] - 32);
            }
        }
        System.out.println(arry);
    }
}
