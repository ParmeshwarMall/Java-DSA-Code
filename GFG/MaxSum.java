package GFG;

public class MaxSum {
    static long maxSumWithK(long a[], long n, long k)
    {
        long []prefixSum=new long[(int)n];
        prefixSum[0]=a[0];
        for(int i=1;i<n;i++)
        {
            prefixSum[i]=prefixSum[i-1]+a[i];
        }

        long maxSum=prefixSum[(int)k-1];
        long minPrefixSum=0;

        for(long i=k;i<n;i++)
        {
            minPrefixSum = Math.min(minPrefixSum, prefixSum[(int)(i - k)]);
            long currentSum = prefixSum[(int)i] - minPrefixSum;
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        long a[]={-4,-2,1,-3};
        System.out.println(maxSumWithK(a,4,2));
    }
}
