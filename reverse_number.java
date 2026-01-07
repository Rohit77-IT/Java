import java.util.*;
class Reverse_number
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int digit,reversed_num = 0,num;
        System.out.print("Enter a number: ");
        num = xx.nextInt();
        while(num>0)
        {
            digit = num %10;
            reversed_num = reversed_num * 10 + digit;
            num /= 10;
        }
        System.out.printf("Reversed num: %d\n",reversed_num);
        xx.close();
    }
}