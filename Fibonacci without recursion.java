import java.util.*;
class Fibonacci_without_recursion
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int n, a=0,b=1,next;
        System.out.print("Enter the number of terms: ");
        n = xx.nextInt();
        System.out.print("Fibonacci series: ");
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",a);
            next = a + b;
            a = b ;
            b = next;
        }
        System.out.print("\n");
        xx.close();
    }
}