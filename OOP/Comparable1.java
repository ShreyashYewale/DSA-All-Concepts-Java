class Student implements Comparable<Student>
{
    int rollno;
    float marks;
    Student(int rollno,float marks)
    {
        this.rollno=rollno;
        this.marks=marks;
    }
    public int compareTo(Student o)
    {
        int diff=this.rollno-o.rollno;
        System.out.println(diff);
        return diff;
        
    }
}
public class Comparable1 {
    
    public static void main(String args[])
    {
        Student shreyash =new Student(11, 98.5f);
        Student kundan=new Student(6,99.5f);
        Student sanket=new Student(3,87.4f);
        Student sameer=new Student(12,89.4f);
        Student tejas=new Student(4,78.5f);

        Student [] list={shreyash,kundan,sanket,sameer,tejas};
        if(shreyash.compareTo(kundan)>0)
        {
            System.out.println("Shreyash has greater marks than kundan");
        }
        else
        {
            System.out.println("Kundan has greater marks than Shreyash");
        }
    }
}
