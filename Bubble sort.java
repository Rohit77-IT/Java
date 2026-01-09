import java.util.*;
class Bubble_sort
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int n,i,j,order,temp;
        System.out.print("Enter the number of elements: ");
        n = xx.nextInt();
        int [] arr = new int[n];
        System.out.printf("Enter %d numbers: ",n);
        for(i=0;i<n;i++)
        {
            arr[i] = xx.nextInt();
        }
        System.out.print("Enter 1 for ascending , 2 for descending: ");
        order = xx.nextInt();
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if((order==1 && arr[j]>arr[j+1]) || (order==2 && arr[j]<arr[j+1]))
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted numbers: ");
        for(i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
        xx.close();
    }
}