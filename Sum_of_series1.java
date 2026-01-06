import java.util.*;
class Sum_of_series1
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int n, i, j, odd;
        float f;
        float sum = 0.0f;
        int sign = -1;
        
        System.out.print("Enter number of terms: ");
        n = xx.nextInt();
        odd = 1;
        
        for (i=1; i<=n; i++)
        {
            f = 1;
            for(j=1; j<=odd; j++)
            {
                f = f * j;
            }
            sum += sign * (1.0/f);
            sign = -sign;
            odd += 2;
        }
        
        System.out.printf("Sumation of series = %f",sum);
        xx.close();
    }
}