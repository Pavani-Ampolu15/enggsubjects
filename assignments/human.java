public class human
{
    String name;
    int age;
    String gender;
    public human(String name,int age,String gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void run(int meters)
    {
       System.out.println("human can run that is measures in meters"+meters);
    }
    public void speak()
    {
        System.out.println("They can speak very well");
    }
    public static void main(String args[])
    {
        human h=new human("abc",45,"F");
        h.run(150);
        h.speak();
    }
}