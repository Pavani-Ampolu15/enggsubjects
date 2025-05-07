import java.util.Scanner;
public class darray
{
    public static void main(String args[])
    {   //dynamic array declaration
       /* int num[]=new int[4];
        num[0]=3;
        num[1]=4;
        num[2]=5;
        num[3]=36;
        System.out.println(num[0]);*/
        Scanner sc=new Scanner(System.in);
        int num[]=new int[4];
        for(int i=0;i<4;i++)
        {
            System.out.println("enter the array values");
            num[i]=sc.nextInt();
            System.out.println(num[i]);
        }
        for(int i=0;i<4;i++)
           System.out.println(num[i]);

        sc.close();
    }
}