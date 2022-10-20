package Java_Strings;

public class Reverse_String {
    public static void main(String[] args) {
        String str="Hello";
        String rev="";
        System.out.println(str);
        System.out.println(str.length());
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
