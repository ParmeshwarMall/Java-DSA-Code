package DynamicProgramming;

public class WildcardMatching {
    static boolean wildcard(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();
        boolean [][]dp=new boolean[n+1][m+1];

        dp[0][0]=true;

        for(int i=1;i<n+1;i++)
        {
            dp[i][0]=false;
        }
        for(int j=1;j<m+1;j++)
        {
            if(s2.charAt(j-1)=='*')
            {
                dp[0][j]=dp[0][j-1];
            }
            else{
                dp[0][j]=false;
            }
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1) || s2.charAt(j-1)=='?')
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(s2.charAt(j-1)=='*')
                {
                    dp[i][j]=(dp[i][j-1] || dp[i-1][j]);
                }
                else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        System.out.println(wildcard("abc","**?b*"));
    }
}
