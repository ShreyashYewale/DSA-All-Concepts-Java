import java.util.*;


public class StreamMethods {
    public static void main(String args[])
    {
            List<String>arr=new ArrayList<>();
            arr.add("Sanket");
            arr.add("Sujit");
            arr.add("Tejas");
            arr.add("Sujit");
            arr.add("Naveen");
            arr.stream().forEach(t->System.out.println(t));//lambda expression of accept method
            //forEach by default uses Consumer Functional Interface and uses accept method internally

            Map<Integer,Character>hm=new HashMap<>();
            hm.put(1,'a');
            hm.put(2,'b');
            hm.put(3,'v');
            hm.put(4,'g');
            hm.entrySet().stream().forEach(obj->System.out.println(obj));


            arr.stream().filter(t->t.charAt(0)=='S').forEach(t->System.out.println(t));

            //filter uses the test method of predicate 
            hm.entrySet().stream().filter(t->t.getKey()%2==0).forEach(t->System.out.println(t));
            
    }
}
