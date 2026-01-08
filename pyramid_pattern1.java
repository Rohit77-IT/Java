import java.util.*;
class pyramid_pattern1
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the value of n: ");
        n = xx.nextInt();
        char ch = 'a';
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.printf("%c",ch+j);
            }
            System.out.print("\n");
        }
        xx.close();
    }
}