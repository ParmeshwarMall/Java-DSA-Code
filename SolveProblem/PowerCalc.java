package SolveProblem;

public class PowerCalc {
    static int a=0;
    static int power(int x,int n)
    {
        if(n==0) return 1;
        if(n>0)
        {
            a=power(x,n/2);
        }
        else
        {
            a=1/power(x,n/2);
        }
        if(n%2==0)
        {
            return a*a;
        }
        else return x*a*a;
    }
    public static void main(String[] args) {
        int x=5;
        int n=-2;
        System.out.println(power(x,n));
    }
}
