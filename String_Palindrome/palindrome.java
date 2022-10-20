package String_Palindrome;

public class palindrome {
    public static void main(String[] args) {
       String str="madam";
       char arry[]=str.toCharArray();
        System.out.println(arry);
        int f=0;
        int l= arry.length-1;
            while(f<=l)
            {
                if(arry[f]!=arry[l])
                {
                    System.out.println("Not a Palindrome");
                    break;
                }
                else
                {
                    f++;
                    l--;
                }
                if(l==f)
                {
                    System.out.println("palindrome");
                }
            }

    }
}
