import java.util.*;
import java.util.Map.Entry;
public class SortMap {
    public static void main(String[] args) {
        Map<Character,Integer>hm=new HashMap<>();
        hm.put('a',2);
        hm.put('c',4);
        hm.put('d',3);
        hm.put('b',2);


        List<Entry<Character,Integer>>entries=new ArrayList<>(hm.entrySet());
        Collections.sort(entries,(o1,o2)->
             o1.getValue()-o2.getValue()
        );

        for(Entry<Character,Integer>entry:entries)
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(t->System.out.println(t.getKey()+" "+t.getValue()));
    }
}
