package SolveProblem;

public class Subarraywiththelargestsum {
    static int maxSubArray(int[] nums) {
        int n = nums.length;
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            cs = cs + nums[i];
            ms = Math.max(cs, ms);
            if (cs < 0) {
                cs = 0;
            }
        }
        return ms;
    }

    public static void main(String[] args) {
        int a[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
}