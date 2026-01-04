import java.util.*;
class Sum_of_series
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int n,i;
        float sum = 0.0f;
        System.out.print("Enter the numb er of terms: ");
        n = xx.nextInt();
        for(i=1;i<n;i++)
        {
            sum += 1.0/i;
        }
        System.out.print("Sum of the series is: " + sum + "\n");
        xx.close();
    }
}