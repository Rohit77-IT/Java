import java.util.*;
class prime_number
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int n,i,ctr=0;
        System.out.print("Enter the number you want to check: ");
        n =  xx.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                ctr++;
            }
        }
        if(ctr==2)
        {
            System.out.print("The number is a prime number");
        }
        else
        {
            System.out.print("The number is not a prime number");
        }
        xx.close();
    }
}