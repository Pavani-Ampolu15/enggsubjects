import java.util.Scanner;
class perfect
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i,rem,sum=0;
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("sum is"+sum);
        if(sum==num)
        {
            System.out.println(num + " is perfect number");
        }
        else
        {
            System.out.println(num + "is not perfect number");
        }
        
        sc.close();
    }
}