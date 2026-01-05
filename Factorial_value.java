import java.util.*;
class Factorial_value
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int number;
        System.out.print("Enter any number: ");
        number = xx.nextInt();
        if(number>=0)
        {
            int result = fact(number);
            System.out.printf("The factorial is: %d",result);
        }
        else
        {
            System.out.print("Enter a positive value");
        }
        xx.close();
    }
    static int fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}