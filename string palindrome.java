import java.util.*;
class String_palindrome
{
    public static void main(String[] args)
    {
        Scanner xx = new Scanner(System.in);
        int i = 0;
        boolean isPalindrome = true;
        System.out.print("Enter a string: ");
        String ster = xx.nextLine();
        int len = ster.length();
        for (i = 0; i < len / 2; i++) {
            if (ster.charAt(i) != ster.charAt(len - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        xx.close();
    }
}