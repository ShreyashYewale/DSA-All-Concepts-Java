public class Interface implements Demo {
    public void start()
    {
        System.out.println("Hello I am Starting");
    }
    public void stop()
    {
        System.out.println("Hello I am Stopping ");
    }
    public static void main(String[] args) {
        Interface i1=new Interface();
        i1.start();
        i1.stop();
    }
}
interface Demo 
{
    void start();
    void stop();
}