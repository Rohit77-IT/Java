import java.util.*;
class HCF_recursion
{
    static int hcf(int a , int b)
    {
        if(b==0)
        return a;
        return hcf(b,a%b);
    }
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter two numbers: ");
        num1 = xx.nextInt();
        num2 = xx.nextInt();
        System.out.printf("HCF of %d and %d is %d\n",num1,num2,hcf(num1,num2));
        xx.close();
    }
}