import java.util.Scanner;
public class matrixaddition
{
    public static void main(String args[])
    {
        int arr[][]=new int[3][3];
        int res[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the matrix 1");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
             arr[i][j]=sc.nextInt();
            }
        }
        
        int arr1[][]=new int[3][3];
        System.out.println("enter the matrix 2");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("mat1");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("mat2");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                res[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("addition is");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}