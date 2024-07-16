import java.util.*;
public class CheckArmstrong {
    static int couDigit(int n)
    {
        int i=0;
        while(n!=0)
        {
            n=n/10;
            i++;
        }
        return i;
    }
    static boolean checkArmstrong(int n,int digit)
    {
        int m=0;
        int x=n;
        while(x!=0)
        {
            int r=x%10;
            m+=(int)Math.pow(r,digit);
            x=x/10;
        }
        if(m==n)
        {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        int n=143;
        int digit=couDigit(n);
        System.out.println(checkArmstrong(n,digit));
    }
}
