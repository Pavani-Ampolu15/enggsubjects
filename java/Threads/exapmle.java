package Threads;
public class exapmle
{
   
    public static void main(String args[])
    {
        //Thread t1= new Thread();
        //t1.start();
        System.out.println("thread starts");
        new even().start();
       // Thread t2=new Thread();
        //t2.start();
    }
}
class even extends Thread{
     public  void run()
    {   
        for(int i=0;i<100;i++)
        {
        if(i%2==0)
        {
        System.out.println(i);
        }
        else if(i%2==1)
        {
           System.out.println("odd "+i); 
        }
        }
    }
}