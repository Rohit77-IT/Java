import java.util.*;
class pyramid_pattern3
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int space,rows,i,k=0;
        System.out.print("Enter the number of rows: ");
        rows = xx.nextInt();
        for(i=1;i<=rows;++i,k=0)
        {
            for(space = 1; space <= rows - i; ++space)
            {
                System.out.print("  ");
            }
            while(k!=2 * i - 1)
            {
                System.out.print(" *");
                ++k;
            }
                System.out.print("\n");
                k=0;
        }
        xx.close();
    }
}