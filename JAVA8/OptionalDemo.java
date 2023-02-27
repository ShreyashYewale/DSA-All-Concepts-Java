import java.util.Optional;
public class OptionalDemo {
    public static void main(String[] args) {
        Employee emp1=new Employee(1,null,5000.00);
        Optional<String>optional=Optional.ofNullable(emp1.getName());
        System.out.println(optional);
        System.out.println(optional.orElse("default null value"));
    }
}
