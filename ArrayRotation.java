import java.util.Scanner;

public class ArrayRotation {
    static void rotate(int a[],int k)
        {
            int n=a.length;
            for(int i=n-k;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
            for(int i=0;i<=k;i++)
            {
                System.out.print(a[i]+" ");
            }
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter size of array");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter element of array");
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
            System.out.println("Enter no. of rotation");
            int k=sc.nextInt();
            rotate(a,k);
        }

    }
