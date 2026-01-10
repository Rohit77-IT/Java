import java.util.*;
class xyz
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
        int i ,j;
        int[][] matrix = new int[5][5];
        System.out.print("Enter 25 elements for the 5x5 matrix: ");
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                matrix[i][j] = xx.nextInt();
            }
        }
        int max = matrix[0][0];
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(matrix[i][j]>max)
                {
                    max = matrix[i][j];
                }
            }
        }
        System.out.printf("The largest number in the matrix is:%d\n",max);
        xx.close();
    }
}