import java.util.*;
class without_Recursion
{
    public static double factorial(int n)
    {
        double fact = 1.0;
        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
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