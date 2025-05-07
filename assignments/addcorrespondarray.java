import java.util.*;

public class addcorrespondarray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("resultant array");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print((int)Math.pow(arr[i][j],2)+ " ");

            }
            System.out.println();
        }
    }
}