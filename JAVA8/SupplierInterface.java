import java.util.function.Supplier;

public class SupplierInterface  {

    // public String get()
    // {
    //     return "Shreyash Here";
    // }
    public static void main(String[] args) {
        Supplier<String> supplier=()->"Shreyash Here";
        System.out.println(supplier.get());
    }
}
