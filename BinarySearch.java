public class BinarySearch {
    static int search(int a[],int n,int target)
    {
        int st=0;
        int end=n-1;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(a[mid]==target) {
                return mid;
            }
            else if(target<a[mid]) {
                end = mid - 1;
            }
            else {
                st = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={7,8,9,45,80};
        int x=search(a,5,8);
        if(x>=0) {
            System.out.println("Element found at index:" + x);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
