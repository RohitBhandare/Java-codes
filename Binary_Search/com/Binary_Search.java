package Binary_Search.com;

public class Binary_Search {
    void Bsearch(int arr[],int low,int high,int key)
    {
        int mid;
        while(low<=high)
        {
            mid=(high+low)/2;
            if(key==arr[mid])
            {
                System.out.println(arr[mid]+" Element found at "+mid+"th index");
                break;
            }
            else if(key<arr[mid])
            {
                high=mid-1;
            }
            else
                low=mid+1;
        }
        if(low>high)
            System.out.println("Element not found");
    }
    public static void main(String[] args)
    {
        System.out.println("Binary Search......");
        int arry[]=new int[] {1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88};
        int key=88;
        int low=0;
        int high= arry.length-1;
        Binary_Search obj=new Binary_Search();
       obj.Bsearch(arry,low,high,key);
    }
}
