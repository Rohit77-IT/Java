import java.util.*;
class pyramid_pattern2
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int i, j, n, a;
        System.out.print("Enter the value of n: ");
        n = xx.nextInt();
        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= n - i; j++)
            {
                System.out.print("   ");
            }
    
            a = i;
            for(j = 1; j <= i; j++)
            {
                System.out.printf(" %d ", a);
                a++;
            }
            a = a - 2;
            for(j = 1; j < i; j++)
            {
                System.out.printf(" %d ", a);
                a--;
            }
    
            System.out.print("\n");
        }
        xx.close();
    }
}