import java.util.*;
class concatenate
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = xx.nextLine();
        System.out.println("Enter second string:");
        String str2 = xx.nextLine();
        
        String result = str1 + str2;
        System.out.println("Concatenated String: " + result);
        xx.close();
    }
}