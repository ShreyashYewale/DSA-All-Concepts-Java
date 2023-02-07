public  abstract class AbstractDemo
{
    public abstract void  write();
    public static void main(String args[])
    {
        Child c=new Child();
        c.write();
    }
}
class Child extends AbstractDemo
{
    public  void write()
    {
        System.out.println("Hello there");
    }
}