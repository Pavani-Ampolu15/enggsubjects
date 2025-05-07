import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class foursum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        foursum fr=new foursum();
        List<List<Integer>> res=fr.foursumcal(arr,target);
        for(List<Integer> resu:res)
        {
            System.out.println(resu);
        }
    }
    public List<List<Integer>> foursumcal(int arr[],int target)
    {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            int left=i+1;
            int right=arr.length-1;
            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];
                int complement=target-sum;
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[j]==complement)
                    {
                        int finalsum=sum+arr[j];
                        list.add(Arrays.asList(arr[i],arr[left],arr[right],arr[j]));
                    }
                }
                
            }return new ArrayList<>(list);
           
        }return null;
    }
}