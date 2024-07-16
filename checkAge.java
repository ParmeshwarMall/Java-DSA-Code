import java.util.*;
public class checkAge {
    public static void main(String[] args){
        System.out.println("Enter Age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<12)
        {
            System.out.println("Child");
        }
        else if(age>12 && age<18)
        {
            System.out.println("Teen Age");
        }
        else {
            System.out.println("Adult");
        }
    }


}
