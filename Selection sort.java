import java.util.*;
class Insertion_sort
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int n, i, j, x, temp, order;
        System.out.print("Enter the number of elements: ");
        n = xx.nextInt();
        int [] arr = new int[n];
        System.out.printf("Enter %d numbers: ", n);
        for(i = 0; i < n; i++)
        {
            arr[i] = xx.nextInt();
        }
        System.out.print("Enter 1 for Ascending , 2 for Descending: ");
        order = xx.nextInt();
        for(i = 0; i < n - 1; i++)
        {
            x = i;
            for(j = i + 1; j < n; j++)
            {
                if((order == 1 && arr[j] < arr[x]) || (order == 2 && arr[j] > arr[x]))
                {
                    x = j;
                }
            }
            if(x != i)
            {
                temp = arr[x];
                arr[x] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.print("Sorted numbers: ");
        for(i = 0; i < n; i++)
        {
            System.out.printf("%d ", arr[i]);
        }
        xx.close();
    }
}