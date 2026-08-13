//Pattern 2:-

//*****
//*   *
//*   *
//*****

import java.util.*;
public class pattern2 {
    public static void main(String args[]) {
        int n = 4;
        int m = 5;

        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++){
                // Print '*' for the first and last row, and for the first and last column
                if(i == 1 || i == n || j == 1 || j == m){
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print space for the inner part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}