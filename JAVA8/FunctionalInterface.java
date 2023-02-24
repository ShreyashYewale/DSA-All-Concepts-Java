
interface Calculator
{
        void switchOn();
}

interface Sum
{
        int sum(int a,int b);
}
public class FunctionalInterface 
{

        
        public static void main(String args[])
        {
         
            Calculator cal=()->{
                System.out.println("Hello");
            };
            cal.switchOn();

            Sum s=(a,b)->a+b;
            System.out.println(s.sum(4, 6));

        }
}