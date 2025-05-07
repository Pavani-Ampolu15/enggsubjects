import java.util.*;
public class conditionarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[3][3];
        int arr2[][]=new int[3][3];
        System.out.println("enter array1:");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("array1:");
         for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter array2:");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("array2:");
         for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        int res[][]=new int[3][3];
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
        
             if(arr1[i][j]==arr2[i][j])
            {
                res[i][j]= 1;        
            }
            else{
                res[i][j]=0;
            }
            }
         }
         System.out.println("the resultant array:");
         for(int i=0;i<res.length;i++)
         {
            for(int j=0;j<res[i].length;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
         }
    }
}
                