import java.util.*;
public class SortListLambda {

   
    public static void main(String[] args) {
        List<Integer>arr=Arrays.asList(3,4,5,6,3,2,1,32,12);
        arr.stream().sorted().forEach(t->System.out.println(t));
        arr.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));//Sorting primitive datatypes

        List<Employee>list=Database.getEmployees();
        
        Collections.sort(list, (o1,o2)->
        (int)o2.getSalary()-(int)o1.getSalary());//Sorting using lamda expressions
        



        list.stream().sorted((o1,o2)->
        (int)o2.getSalary()-(int)o1.getSalary()).forEach(System.out::println);

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).salary);
        }

    }
}

    

