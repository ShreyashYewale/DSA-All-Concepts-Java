import java.util.*;
public class Database {
    public static List<Employee> getEmployees()
    {
        List<Employee>arr=new ArrayList<>();
        arr.add(new Employee(1, "Shreyash", 15000.0));
        arr.add(new Employee(2, "Sanket", 17000.0));
        arr.add(new Employee(3, "Tejas", 8000.0));
        arr.add(new Employee(4, "Sameer", 10000.0));
        arr.add(new Employee(5, "Sujit", 45000.0));
        return arr;
    }
}
