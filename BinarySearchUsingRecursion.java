public class BinarySearchUsingRecursion {
    static int search(int a[],int st,int end,int target)
    {
        if(st>end)
            return -1;

        int mid=(st+end)/2;
        if(target==a[mid])
            return mid;

        else if(target<a[mid])
            return search(a,st,mid-1,target);
        else
            return search(a,mid+1,end,target);
    }

    public static void main(String[] args) {
        int a[]={4,5,6,7,8};
        int n=5;
        for(int i=0;i<=10;i++)
        {
            int x = search(a, 0, n - 1,i );
            if(x>=0) {
                System.out.printf("%d present at index: %d\n", i, x);
            }
            else {
                System.out.printf("%d not present\n", i);
            }
        }
    }
}
