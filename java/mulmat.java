import java.util.Scanner;
public class mulmat
{
    public static void main(String args[])
    {
        int a1[][]=new int[3][4];
        int a2[][]=new int[4][4];
        int res[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("enter the mat1");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
              a1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the mat2");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
              a2[i][j]=sc.nextInt();
            }
        }
        System.out.println(" mat1");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
              System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println(" mat2");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
              System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
       for(int i=0;i<3;i++)
       {
        for(int j=0;j<4;j++)
        {
            res[i][j]=0;
            for(int k=0;k<4;k++)
            {
                res[i][j]+=a1[i][k]*a2[k][j];
            }
        }
       }
        System.out.println("mul");
       for(int i=0;i<3;i++)
       {
        for(int j=0;j<4;j++)
        {
            System.out.print(res[i][j]+ " ");
        }
        System.out.println();
       }
    }
}