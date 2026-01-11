import java.util.*;
class CopyString
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str1 = xx.nextLine();
        char[] str2 = new char[str1.length()];
        int i = 0;
        while(i<str1.length())
        {
            str2[i] = str1.charAt(i);
            i++;
        }
        String result = new String(str2);
        System.out.printf("Copied String is: %s\n",result);
        xx.close();
    }
}