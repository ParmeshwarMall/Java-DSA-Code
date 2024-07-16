import java .util.*;
public class binaryTodec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary no.");
        int b=sc.nextInt();
        int ans=0;
        int p=1;
        while(b>0)
        {
            int unitDigit=b%10;
            ans+=unitDigit*p;
            b=b/10;
            p=p*2;
        }
        System.out.println(ans);
    }
}
