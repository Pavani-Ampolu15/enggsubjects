public class arrayofobjects
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.rno=2;
        s1.name="abc";
        s1.marks=92;
        Student s2=new Student();
        s2.rno=1;
        s2.name="def";
        s2.marks=73;
        Student s3=new Student();
        s3.rno=3;
        s3.name="ghi";
        s3.marks=56;
        Student stu[]=new Student[3];
        stu[0]=s1.rno;
        stu[1]=s2.rno;
        stu[2]=s3.rno;
        for(int s:stu)
        {
            System.out.println(s.name + " " + s.marks);
        }
        
    }
}
class Student
{
    int rno;
    String name;
    int marks;
}