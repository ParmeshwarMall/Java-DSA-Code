import java.util.*;
public class BubbleSortUsingFunction {
    static void sort(int a[], int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int swap=a[j];
                    a[j]=a[j+1];
                    a[j+1]=swap;
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the no that you want to sort");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        sort(a,n);
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
