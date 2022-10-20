package String_Palindrome;

public class Reverse_Number {
    public static void main(String[] args) {
        long num = 1534236469, sum = 0, temp = 0;
        temp = num;
            while (num != 0) {
                sum = (sum * 10) + num % 10;
                num = num / 10;
            }
            System.out.println(sum);
    }
}
