package Array_Practice_Example;

public class First_Recuring_Character {
    public static void main(String[] args) {
        String str="DBCAAAB";
        char a='\0';
        int count=0;
        char[] array =str.toCharArray();
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==(array[j]))
                {
                    a=array[j];
                    count++;
                }
            }
        }

        System.out.println(a+" "+count);

    }

}
