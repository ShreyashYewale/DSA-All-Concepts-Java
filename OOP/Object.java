public class Object {
    public static void main(String args[])
    {
        Student shreyash=new Student("Shreyash",01,78.5f);
        System.out.println(shreyash.marks);
        Student rahul=new Student();
        System.out.println(rahul.marks);
    }
}
class Student
{
    String name;
    int rno;
    float marks;

    Student()
    {
        this.name="Rahul";
        this.rno=34;
        this.marks=45.5f;

    }
    Student(String name,int rno,float marks)
    {
        this.name=name;
        this.rno=rno;
        this.marks=marks;
    }
}
