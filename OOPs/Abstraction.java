package OOPs;

abstract class shape
{
    abstract void draw();
}
class circle extends shape
{
    void draw()
    {
        System.out.println("Drawing circle");
    }
}
class square extends shape
{
    void draw()
    {
        System.out.println("Drawing square");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        circle c=new circle();
        square s=new square();
        c.draw();
        s.draw();
    }

}
