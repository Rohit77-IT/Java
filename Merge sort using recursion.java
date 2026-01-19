import java.util.*;
class Mergesort
{
    static void merge(int arr[],int left,int mid,int right)
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0;i<n1;i++)
        L[i] = arr[left + i];
        for(int j = 0;j<n2;j++)
        R[j] = arr[mid+1+j];
        int i =0,j=0,k=left;
        while(i<n1 && j<n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
        else
        {
            arr[k] = R[j];
            j++;
        }
        k++;
        }
        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void mergesort (int arr[],int left,int right)
    {
        if(left<right)
        {
            int mid = left + (right-left)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    static void printArray(int arr[],int size)
    {
        for(int i =0;i<size;i++)
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
        printArray(arr,n);
        mergesort(arr,0,n-1);
        System.out.print("Sorted Array: ");
        printArray(arr,n);
        xx.close();
    }
}