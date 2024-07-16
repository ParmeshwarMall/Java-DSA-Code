/*import java.util.*;
public class Array2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter element of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }

    }*/


public class Array2
{
    static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        printArray(a);
    }
}
