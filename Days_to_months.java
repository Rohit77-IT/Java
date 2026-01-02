import java.util.*;
class Days_to_months
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int days,months,remaining_days;
        System.out.print("Enter the number of days: ");
        days = xx.nextInt();
        months = days / 30;
        remaining_days = days % 30;
        System.out.println(String.format("%d days is same as %d months and %d days",days,months,remaining_days));
    }
}