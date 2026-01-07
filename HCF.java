import java.util.*;
class HCF
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int a,b,i,hcf=0;
        System.out.print("Enter the value of a: ");
        a = xx.nextInt();
        System.out.print("Enter the value of b: ");
        b = xx.nextInt();
        for(i=1;i<=a && i<=b;i++)
        {
            if(a%i == 0 && b%i == 0)
            {
                hcf = i;
            }
        }
        System.out.print("Hcf of " + a + " and " + b + " is " + hcf);
        xx.close();
    }
}