public class BacktrackingInArray {
    static void printArr(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void changeArr(int a[],int idx,int val)
    {
        if(idx==a.length)
        {
            printArr(a);
            return;
        }
        a[idx]=val;
        changeArr(a,idx+1,val+1);
        a[idx]=a[idx]-2;

    }

    public static void main(String[] args) {
        int a[]=new int[5];
        changeArr(a,0,1);
        printArr(a);
    }
}
