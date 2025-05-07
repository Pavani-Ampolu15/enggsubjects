import java.util.Scanner;
class reverse
{
    public static void main(String []args)
    {
        int num,temp,digit,rev;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        num=sc.nextInt();
        temp=num;
        rev=0;
        while(num>0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("rev of a number is"+rev);
    }
}