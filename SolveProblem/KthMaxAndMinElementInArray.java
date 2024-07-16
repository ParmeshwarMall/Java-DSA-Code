package SolveProblem;

public class KthMaxAndMinElementInArray {
    public static void main(String[] args) {
        int a[]={2,0,2,1,1,0};
        int n=a.length;
        int ans[]=new int[n];
        int [] freq=new int[3];
        for(int i=0;i<n;i++)
        {
            freq[a[i]]++;
        }
        int k=0;
        for(int i=0;i<3;i++)
        {
            int x=freq[i];
            while(x>0)
            {
                ans[k++]=i;
                x--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
