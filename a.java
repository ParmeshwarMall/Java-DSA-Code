import java.util.*;
class animal{
    static void bark()
    {
        System.out.println("Bark");
    }
}
class dog extends animal{
    void eat()
    {
        System.out.println("Sleep");
    }
}
public class a
{
    public static void main(String[] args) {
        dog d=new dog();
        d.bark();
        d.eat();
    }
}
