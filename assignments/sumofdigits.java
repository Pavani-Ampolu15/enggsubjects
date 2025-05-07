import java.util.Scanner;
class sumofdigits
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num,rem,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println(" sum is"+sum);
        sc.close();
        }
        
    }
