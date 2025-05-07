import java.util.*;
public class threesumclosest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=threesumclosest(arr,target);
        System.out.println(res);
    }
    public static int threesumclosest(int arr[],int target)
    { 
        Arrays.sort(arr);
        int sumclosest=Integer.MAX_VALUE/2;
        for(int i=0;i<arr.length;i++)
        {
            int left=i+1;
            int right=arr.length-1;
            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];
                if(Math.abs(target-sum)<Math.abs(target-sumclosest))
                   sumclosest=sum;
                if(sum<target)
                   left++;
                else if(sum>target)
                   right--;
                else
                  return sum;
            }
        }
        return sumclosest;
    }
}