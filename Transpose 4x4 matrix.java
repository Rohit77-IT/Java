import java.util.*;
class Transpose_4x4_matrix
{
    public static void main(String args[])
    {
        Scanner xx = new Scanner(System.in);
         int i ,j;
        int [][]matrix = new int[5][5];
        int[][] transpose = new int[4][4];
        System.out.print("Enter 16 elements for the 4x4 matrix: ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                matrix[i][j] = xx.nextInt();
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.print("Transpose of the given matrix: \n");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            System.out.printf("%d ",transpose[i][j]);
            System.out.print("\n");
        }
        xx.close();
    }
}