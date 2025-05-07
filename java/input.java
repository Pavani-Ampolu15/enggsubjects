import java.util.Scanner;
class input
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("entered number is even"+num);
        }
        else
        {
            System.out.println("entered number is odd"+num);
        }
        sc.close();
    }
}