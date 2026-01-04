import java.util.*;
class Grade_student
{
    public static void main(String args[])
    {
        Scanner xx =  new Scanner(System.in);
        float number;
        System.out.print("Enter the marks obtained: ");
        number = xx.nextFloat();
            if(number>=90 && number<=100)
            {
                System.out.print("Your grade is O\n");
            }
            else if(number>=80 && number<90)
            {
                System.out.print("Your grade is E\n");
            }
            else if(number>=70 && number<80)
            {
                System.out.print("Your grade is A\n");
            }
            else if(number>=60 && number<70)
            {
                System.out.print("Your grade is B\n");
            }
            else if(number>=50 && number<60)
            {
                System.out.print("Your grade is C\n");
            }
            else if(number>=40 && number<50)
            {
                System.out.print("Your grade is D\n");
            }
            else if(number>=0 && number<40)
            {
                System.out.print("Your grade is F\n");
            }
            else
            {
                System.out.print("Invalid number entered.\n");
            }
        xx.close();
        }
    }