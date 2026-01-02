import java.util.*;
class Swap
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int a,b;
        System.out.print("Enter the value of a: ");
        a = xx.nextInt();
        System.out.print("Enter the value of b: ");
        b = xx.nextInt();
        System.out.print(String.format("Before swapping: a = %d, b=%d\n",a,b));
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print(String.format("After swapping: a=%d, b=%d\n",a,b));
        xx.close();
    }
}