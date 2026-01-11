import java.util.*;
class LengthMeasure
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = xx.nextLine();
        char[] characters = input.toCharArray();
        int length = 0;
        for (char c : characters)
        {
            length++;
        }
        System.out.printf("Length of the String is: %s\n",length);
        xx.close();
    }
}