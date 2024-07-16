import java.util.*;
public class CalculateGCD {
    static int gcd(int x, int y)
    {
        while(x%y!=0)
        {
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no.");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("GCD= "+gcd(x,y));
    }
}
