import java.util.*;
import java.util.function.Predicate;
public class PredicateInterface  {
    
    public static void main(String[] args) {
        Predicate<Integer>predicate =(t)->{
            return t%2==0?true:false;
        };
        System.out.println(predicate.test(4));

        List<Integer>list1=Arrays.asList(1,2,3,4,5);
        list1.stream().filter(predicate).forEach(t->System.out.println(t));

    }
}
