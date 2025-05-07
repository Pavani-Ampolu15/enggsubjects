import java.util.Scanner;
public class product
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem=1;
        while(num>0)
        {
            int temp=num%10;
            rem*=temp;
            num/=10;
        }
        System.out.println(rem);
    }
}