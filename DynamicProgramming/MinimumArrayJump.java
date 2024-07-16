package DynamicProgramming;

import java.util.Arrays;

public class MinimumArrayJump {
    static int MAJ(int a[])
    {
        int n=a.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            int jump=a[i];
            int ans=Integer.MAX_VALUE;
            for(int j=i+1;j<=i+jump && j<n;j++)
            {
                if(dp[j]!=-1)
                {
                    ans=Math.min(ans,dp[j]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE)
            {
                dp[i]=ans;
            }
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int a[]={2,3,1,1,4};
        System.out.println(MAJ(a));
    }
}
