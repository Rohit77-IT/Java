import java.util.*;
public class Farenheit_to_celcius {

    public static void main(String args[])
    {
        Scanner xx =new Scanner (System.in);
        float ft,cs;
        System.out.print("Enter the temperature n Farenheit: ");
        ft = xx.nextFloat();
        cs = (float)((5.0/9.0)*(ft-32));
        System.out.println(String.format("%.2f Farenheit is same as %.2f Celcius",ft,cs));
        xx.close();
    }
}