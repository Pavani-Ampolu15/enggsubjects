import java.util.Scanner;
class gcd
{
    public static void main(String []args)
    {
        int x,y,m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x");
        x=sc.nextInt();
        System.out.println("enter the value of y");
        y=sc.nextInt();
        m=x;
        n=y;
        while(m!=n)
    {
        if(m>n)
        {
            m=m-n;
        }
        else
        {
            n=n-m;
        }
    }
    System.out.println(n);
    }
}