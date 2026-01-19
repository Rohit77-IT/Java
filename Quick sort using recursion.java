import java.util.*;
class Quicksort
{
    static int partition(int arr[],int low,int high)
    {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    static void quicksort(int arr[] ,int low,int high)
    {
        if(low<high)
        {
            int pi = partition(arr,low,high);
        quicksort(arr,low,pi-1);
        quicksort(arr,pi+1,high);
        }
    }
    static void printArray(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
        System.out.print("\n");
    }
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int m;
        System.out.print("Enter the size of array: ");
        m = xx.nextInt();
        int[] arr = new int[m];
        System.out.printf("Enter %d integers: ",m);
        for(int i = 0; i < m; i++) 
        {
            arr[i] = xx.nextInt();
        }
        int n = m;
        System.out.print("Original array: ");
        printArray(arr, n);
        quicksort(arr,0,n-1);
        System.out.print("Sorted array: ");
        printArray(arr, n);
        xx.close();
    }
}