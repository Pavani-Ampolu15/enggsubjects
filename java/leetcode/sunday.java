import java.util.Scanner;
public class sunday
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int numdays=sc.nextInt();
        String day=sc.next();
        String arr[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i].equals(day))
            {
                break;
            }
            
        }
        int res=1;
            int rem=6-i;
            numdays-=rem;
            if(numdays>0)
            {
                res+=numdays/7;
                System.out.println(res);
            }
    }
}