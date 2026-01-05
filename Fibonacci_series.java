import java.util.*;
class Fibonacci_series
{
public static void main(String args[])
{
    Scanner xx = new Scanner(System.in);
    int n;
    int first=1,second=1,next;
    System.out.print("Enter the number of terms: ");
    n = xx.nextInt();
    System.out.println("Fibonacci series: ");
    for(int i =1;i<=n;i++)
    {
        System.out.print(first + " ");
        next = first+second;
        first = second;
        second = next;
    }
    System.out.print("\n");
    xx.close();
}
}