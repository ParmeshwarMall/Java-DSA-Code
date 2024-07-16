package Recursion;

public class PowerOfNumber {
    static int pow(int x,int n)
    {
        if(n==0)
            return 1;

        return x*pow(x,n-1);
    }

    static int optimizePow(int x,int n)
    {
        if(n==0)
            return 1;

        int halfPow=optimizePow(x,n/2);
        int halfPowSq=halfPow*halfPow;
        if(n%2!=0)
        {
            halfPowSq=halfPowSq*x;
        }
        return  halfPowSq;
    }

    public static void main(String[] args) {
        //System.out.println(pow(2,10));
        System.out.println(optimizePow(2,10));
    }
}
