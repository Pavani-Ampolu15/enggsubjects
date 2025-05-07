import java.util.*;
public class arraysumele
{
       public static void main(String args[])
       {
            Scanner sc=new Scanner(System.in);
            int arr[][]=new int[3][3];
            System.out.println("enter the array");
            for(int i=0;i<arr.length;i++)
            {
                //int stor[]=arr[i];
                for(int j=0;j<arr[i].length;j++)
                {
                    arr[i][j]=sc.nextInt();
                     
                }
               
            }
            System.out.println("the res array:");
            for(int i=0;i<arr.length;i++)
            {
                //int stor[]=arr[i];
                for(int j=0;j<arr[i].length;j++)
                {
                  System.out.print(arr[i][j]+" ");
                     
                }
                
               System.out.println();
            }
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    sum+=arr[i][j];
                }
                
       }
        System.out.println(sum);
            }
           
}
