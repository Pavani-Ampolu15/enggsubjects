import java.util.Scanner;
public class riskfactor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int items=sc.nextInt();
        int riskfacarr[]=new int[items];
        for(int i=0;i<items;i++)
        {
            riskfacarr[i]=sc.nextInt();
        }
        for(int j=0;j<riskfacarr.length-1;j++)
        {
            for (int i = 0; i < riskfacarr.length - 1 - j; i++)
            {
            if(riskfacarr[i]>riskfacarr[i+1])
            {
                int temp=riskfacarr[i];
                riskfacarr[i]=riskfacarr[i+1];
                riskfacarr[i+1]=temp;
            }
            }
        }
        for(int i=0;i<riskfacarr.length;i++)
        {
            System.out.println(riskfacarr[i]);
        }
    }
}