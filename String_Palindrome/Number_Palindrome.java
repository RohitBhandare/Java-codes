package String_Palindrome;

public class Number_Palindrome {
    public static void main(String[] args) {
        int num = 121, sum = 0, temp = 0;
        temp = num;
        while (num > 0) {
            sum = (sum * 10) + num % 10;
            num = num / 10;

        }
        if (temp == sum) {
            System.out.println("palindrome");
        }

        else
            {
                System.out.println("Not a Palindrome");
            }

        }
    }

