import java.util.Scanner;
public class threenum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-2;i++)
        {
            if(arr[i]==arr[i+1] && arr[i+1]==arr[i+2] && arr[i+2]==arr[i])
            {
                System.out.println("0");
            }
            if(arr[i]!=arr[i+1] && arr[i+1]!=arr[i+2])
            {
                System.out.println("-1");
            }
        }
    }
}