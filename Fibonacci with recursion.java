import java.util.Scanner;

class FibonacciRecursion
{
    static void fibonacci(int a, int b, int n)
    {
        if (n > 0)
        {
            System.out.print(a + " ");
            fibonacci(b, a + b, n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner xx = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = xx.nextInt();
        if (num <= 0)
        {
            System.out.println("Please enter a valid number");
        }
        else
        {
            System.out.print("Fibonacci series: ");
            fibonacci(0, 1, num);
            System.out.println();
        }
        xx.close();
    }
}