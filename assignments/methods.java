//methods in java
import java.util.Scanner;
class methods
      {
        public static void main(String args[])
        { 
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the price");
           int sp=sc.nextInt();
           phone ph=new phone();
           int res1=ph.screen();
           int res2=ph.battery();
           int res=ph.cost(sp);
           System.out.println(res1 + "\t" +res2 + "\t" + res);
           sc.close();
        }
      } 
class phone
{
    public int screen()
    {
        System.out.println("i will diplay whatever you want");
        return 1;
    }
    public int battery()
    {
        System.out.println("i will e the life survivor");
        return 0;
    }
    public int cost(int price)
    {
        if(price<=10000)
        {
            System.out.println("no phone is available with that cost");

        }
        else{
            System.out.println("available");
        }
        return 0;
    }
}