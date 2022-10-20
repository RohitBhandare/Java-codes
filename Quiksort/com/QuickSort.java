package Quiksort.com;

public class QuickSort {
    void sort(int arr[],int high, int low, int size)
    {
        int pivot,i,j;
        if(low<high)
        {
            i=low;
            j=high;
            pivot=arr[low];
            while(i<=j) {
                while (arr[i] <=pivot)
                    i++;
                while (arr[j] > pivot)
                    j--;
                if (i < j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;

            sort(arr,high,j+1,size);
            sort(arr,j-1,low,size);
        }


    }
    public static void main(String[] args)
    {
        System.out.println(".........Quick Sort........");
        int arr[]=new int[] {15, 12, 10, 38, 86, 52, 91,55,66,77};
        int size= arr.length;
        int low=0;
        int high=size-1;
        QuickSort obj=new QuickSort();
        obj.sort(arr,high,low,size);
        System.out.println("Sorted: " );
        for(int s=0;s<size;s++)
        {
            System.out.print(" "+arr[s]);
        }
    }
}
