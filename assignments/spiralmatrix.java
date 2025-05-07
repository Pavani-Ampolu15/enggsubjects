package leetcode;
import java.util.*;
public class spiralmatrix
{
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> twodarray=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                int ele=sc.nextInt();
                row.add(ele);
            }
            twodarray.add(row);
        }
        ArrayList<Integer> ans=spiral(twodarray,m,n);
        for(int i:ans)
        {
            System.out.print(i+" ");
        }

    }
    public static ArrayList<Integer> spiral(ArrayList<ArrayList<Integer>> twodarray,int m,int n)
    {
        int top=0;int left=0;int right=n-1;int bottom=m-1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(left<=right && top<=bottom)
        {
        for(int i=left;i<=right;i++)
        {
            ans.add(twodarray.get(top).get(i));
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            ans.add(twodarray.get(i).get(right));
        }
        right--;
        if (top <= bottom) {
        for(int i=right;i>=left;i--)
        {
            ans.add(twodarray.get(bottom).get(i));
        }
        bottom--;
        }
        if(left<=right)
        {
        for(int i=bottom;i>=top;i--)
        {
            ans.add(twodarray.get(i).get(left));
        }
        left++;
        }
        }
        return ans;
    }
}