import java.util.Scanner;
public class dectobin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String res="";
        while(num>0)
        {
            int rem=num%2;
            res=rem+res;
            num/=2;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<res.length();i++)
        {
            if(res.charAt(i)=='1')
            str.append('0');
            else 
            str.append('1');
        }
        int resu=Integer.parseInt(str.toString(),2);
        System.out.println(resu);
    }
}