import java.util.*;
import java.util.function.Consumer;
public class ConsumerInterface  {
    
    public static void main(String[] args) {
        Consumer<Integer> ci=(t)->System.out.println("Printing"+t);
        ci.accept(10);

        List<Integer>list1=Arrays.asList(1,2,3,4,5);
        list1.stream().forEach(ci);
    }
}
