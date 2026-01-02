import java.util.*;
class leapyear
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int year;
        System.out.print("Enter the year you want to check: ");
        year = xx.nextInt();
        if((year%400==0) || (year%100!=0 && year%4==0))
        {
            System.out.print(String.format("%d is a leap year\n",year));
        }
        else
        {
            System.out.print(String.format("%d is not a leap year\n",year));
        }
        xx.close();
    }
}