import java.util.*;
public class BasicOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);   // Print Whole String

        System.out.println(s.charAt(3));   // Print element at Index 3 of String

        System.out.println(s.substring(3,7));
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+" ");  // print element of string
        }


    }
}
