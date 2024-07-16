import java.util.*;
public class CalculateRectangularSum {

    static int calcRectangleSum(int matrix[][], int r1, int c1, int r2, int c2)
    {
        int sum=0;
        for(int i=r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
    static void prefixSum(int matrix[][]) {
        int r = matrix.length;
        int c = matrix[0].length;

        // Calculate row wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // Calculate column wise preix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

        static int calcRectangularSum(int matrix[][], int r1, int c1, int r2, int c2)
        {
            prefixSum(matrix);
            int ans=0,up=0,left=0,upLeft=0;
            int sum=matrix[r2][c2];
            if(r1>=1) {
                up = matrix[r1 - 1][c2];
            }
            if(c1>=1) {
                left = matrix[r2][c1 - 1];
            }
            if(r1>=1 && c1>=1) {
                upLeft = matrix[r1 - 1][c1 - 1];
            }

            ans=sum-up-left+upLeft;
            return ans;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("Enter "+r*c+" element");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter boundries of rectangle");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        System.out.println("Sum of rectangle is:"+calcRectangleSum(matrix,r1,c1,r2,c2));
        System.out.println("Sum of rectangle is:"+calcRectangularSum(matrix,r1,c1,r2,c2));

    }
    }
