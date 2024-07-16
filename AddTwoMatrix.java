import java.util.*;
public class AddTwoMatrix {
    static void printMatrix(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void addMatrix(int a1[][], int r1, int c1, int a2[][], int r2, int c2)
    {

        int sum[][]=new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                sum[i][j]=a1[i][j]+a2[i][j];
            }
        }
        printMatrix(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row no. of first matrix");
        int r1=sc.nextInt();
        System.out.println("Enter column no. of first matrix");
        int c1=sc.nextInt();
        System.out.println("Enter matrix");
        int a1[][]=new int[r1][c1];
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a1[i].length;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter row no. of second matrix");
        int r2=sc.nextInt();
        System.out.println("Enter column no. of second matrix");
        int c2=sc.nextInt();
        if(r1!=r2 && c1!=c2)
        {
            System.out.println("Addition not possibleEnter a valid matrix");
            return;
        }
        System.out.println("Enter matrix");
        int a2[][]=new int[r1][c1];
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a1[i].length;j++)
            {
                a2[i][j]=sc.nextInt();
            }
        }

        System.out.println("Your sum matrix is: ");
        addMatrix(a1,r1,c1,a2,r2,c2);
    }
}
