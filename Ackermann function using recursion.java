import java.util.*;
class Ackermann
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int m,n;
        System.out.print("Enter the value of 'm' and 'n' respectively: ");
        m = xx.nextInt();
        n = xx.nextInt();
        System.out.printf("The Ackermann valueis: %d",ack(m,n));
        xx.close();
    }
    static int ack(int m,int n)
    {
        if(m==0)
        {
            return n+1;
        }
        else if(n==0)
        {
            return ack(m-1,1);
        }
        else
        {
            return ack(m-1,ack(m,n-1));
        }
    }
}