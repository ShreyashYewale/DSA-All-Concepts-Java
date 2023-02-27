import java.util.*;
public class FilterMapReduce {
    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(1,2,4,3,2,6,4);
        int sum=arr.stream().mapToInt(i->i).reduce(0, (a,b)->a+b);
        //Calculating sum using mapReduce Function
        System.out.println(sum);

        //Calculating max element in array

        int maxele=arr.stream().mapToInt(i->i).reduce(0,(a,b)->a>b?a:b);
        System.out.println(maxele);



        //Calculating string with max length
        List<String>str=Arrays.asList("Shreyash","Sanket","Harshal","Sujit","Tejas","Sammer");
        String str1=str.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
        System.out.println(str1);






    }
}
