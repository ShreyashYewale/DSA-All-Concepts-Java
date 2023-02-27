

import java.util.stream.IntStream;
import java.util.*;


public class ParallelStream {
    public static void main(String[] args) {
        long start=0;
        long end=0;
        start=System.currentTimeMillis();

        //Sequential Stream
        IntStream.range(0, 100).forEach(t->System.out.println(t));
        end=System.currentTimeMillis();
        // System.out.println("Sequential  Stream Time"+(end-start));




        start=System.currentTimeMillis();
        //Parallel Stream
        IntStream.range(0, 100).parallel().forEach(t->System.out.println(t));
        end=System.currentTimeMillis();

        // System.out.println("Parallel Stream Time"+(end-start));



        List<Employee>ans=EmployeeDatabase.getAllEmployees();

        start=System.currentTimeMillis();
        double avgsalaryNormal=ans.stream().mapToDouble(i->i.getSalary()).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("Sequential  Stream Time"+(end-start));
        System.out.println(avgsalaryNormal);

        start=System.currentTimeMillis();
        double avgsalaryParallel=ans.stream().mapToDouble(i->i.getSalary()).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("Parallel Stream Time"+(end-start));
        System.out.println(avgsalaryParallel);


    }
}
