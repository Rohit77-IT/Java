import java.util.*;
class CompareStrings
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String str1 = xx.nextLine();
        System.out.print("Enter Second String: ");
        String str2 = xx.nextLine();
        boolean isequal = true;
        if(str1.length() != str2.length())
        {
            isequal = false;
        }
        else
        {
            int i = 0;
        while(i<str1.length())
        {
            if(str1.charAt(i) !=  str2.charAt(i))
            {
                isequal = false;
                break;
            }
            i++;
        }
    }
    if(isequal)
    {
        System.out.print("Both are same string.");
    }
    else
    {
        System.out.print("Both are different string.");
    }
        xx.close();
    }
}