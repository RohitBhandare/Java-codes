package String_Palindrome;

public class Lower_Case_Replace_Hash {
    public static void main(String[] args) {
        String str="hEllo";
        char array[]=str.toCharArray();
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>='a' && array[i]<='z')
            {
                array[i]='#';
            }

        }
        System.out.println(array);
    }
}
