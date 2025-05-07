import java.util.Scanner;
public class maxconsecutiveones
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
                max=max(max,count);
                
            }
            else
            {
                count=0;
            }
        }
        System.out.println("max no. of ones"+max);
    }
    public static int max(int max,int count)
    {
        if(max>count)
         return max;
        else 
         return count;
    }
}