public class school{
    private String school_name;
    private int number_of_students;
    /*school(String scl_name,int numberofstudents)
    {
        this.scl_name=scl_name;
        this.numberofstudents=numberofstudents;
    }*/
    
    public void setSchool_name(String scl_name,int numberofstudents)
    {
        this.school_name=scl_name;
        this.number_of_students=numberofstudents;
    }
    public String getSchool_name()
    {
        return school_name;
    }
    public int getNumber_of_students()
    {
        return number_of_students;
    }
    public void teachers()
    {
        System.out.println("teachers teach lessons");
    }
    public static void main(String args[])
    {
        school sc=new school();
        sc.teachers();

    }
}