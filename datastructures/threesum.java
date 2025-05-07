import java.util.*;
public class threesum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> res=threesum(arr);
        for(List<Integer> resu:res)
        {
            System.out.println(resu);
        }
    }
    public static List<List<Integer>> threesum(int arr[])
    {
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            int left=i+1;
            int right=arr.length-1;
            while(left<right)
            {
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0)
                {
                    set.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }
                else if(sum<0)
                   left++;
                else
                    right--;
            }
            return new ArrayList<>(set);
        }
        return null;
    }
}