import java.util.*;
public class CalculateGCDUsingRecursion {
    static int gcd(int x,int y)
    {
        if(y==0)
            return x;

        return gcd(y,x%y);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no.");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("GCD= "+gcd(x,y));
        int p=gcd(x,y);
        System.out.println("LCM= "+(x*y)/p);
    }

}
