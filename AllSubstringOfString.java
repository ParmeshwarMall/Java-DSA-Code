import java.util.*;
public class AllSubstringOfString {
    static void subSet(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length()+1;j++)
            {
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        subSet(s);
    }
}
