import java.util.*;
class without_Recursion
{
    public static double factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1.0;
        }
        return n * factorial(n-1);
    }
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = xx.nextInt();
        if(num < 0)
        {
            System.out.print("Invalid number\n");
        }
        else
        {
            System.out.printf("Factorial of %d is %.0f\n", num, factorial(num));
        }
        xx.close();
    }
}