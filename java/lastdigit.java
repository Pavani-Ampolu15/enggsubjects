import java.util.Scanner;
class lastdigit
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int n;
        if(num%10 != 0)
        {
            n=num%10;
            System.out.println(n);
        }
        
        sc.close();
    }
}