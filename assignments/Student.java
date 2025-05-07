public class Student extends school{
    private String stu_name;
    private int roll_no;
    private int age;
    //constructor
    public Student(String stu_name,int roll_no,int age)
    {
        this.stu_name=stu_name;
        this.roll_no=roll_no;
        this.age=age;
    }
    //get the student name
    public String getStu_name()
    {
        return stu_name;
    }
    //setting values tho the student name
    public void setStu_name(String stu_name)
    {
        this.stu_name=stu_name;
    }
    public void reads(String parag)
    {
        System.out.println("it may be the paragraph");
    }
    public static void main(String args[])
{
   Student st=new Student("Rehanna",27,21);
   System.out.println("Student name:"+st.getStu_name());
   st.setSchool_name("OXFORD",2890);
   System.out.println("student  "+st.getSchool_name());
   System.out.println(" number of students"+st.getNumber_of_students());
   st.reads("read reads you");
}

}