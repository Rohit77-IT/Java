import java.util.*;
class Insertion_sort
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int n,i,j,key,order;
        System.out.print("Enter the number of elements: ");
        n = xx.nextInt();
        int [] arr = new int[n];
        System.out.printf("Enter %d numbers: ",n);
        for(i=0;i<n;i++)
        {
            arr[i] = xx.nextInt();
        }
        System.out.print("Enter 1 for Ascending , 2 for Descending: ");
        order = xx.nextInt();
        for(i=1;i<n;i++)
        {
            key = arr[i];
            j = i-1;
            while(j>=0 && ((order==1 && arr[j]>key) || (order==2 && arr[j]<key)))
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.print("Sorted numbers: ");
        for(i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
        xx.close();
    }
}