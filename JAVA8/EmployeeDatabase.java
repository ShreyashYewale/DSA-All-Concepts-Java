import java.util.*;
public class EmployeeDatabase {
    

    public static List<Employee> getAllEmployees()
    {
        List<Employee>arr=new ArrayList<>();
        for(int i=0;i<=100;i++)
        {
            arr.add(new Employee(i, "Shreyash"+i, Double.valueOf(1000*i)));
        }
        return arr;
    }
}
