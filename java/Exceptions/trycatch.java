public class trycatch
{
    public static void main(String args[])
    { 
    try
    {
        int i = 10/0;
    }
    catch(ArithmeticException e)
    {
        //return e;
        System.out.println("catch block executed successfully");
        throw e;
       // e.printStackTrace();
    }
    finally
    {
        int n= 10*10;
        System.out.println(n);
    }
    }
}