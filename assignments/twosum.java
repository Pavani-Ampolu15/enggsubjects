package collections;
import java.util.*;
public class twosum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("array");
        for(int i:arr)
        System.out.println(i);
        System.out.println("enter target");
        int target=sc.nextInt();
        int result[]=twosum(arr,target);
        if(result!=null)
        {
            System.out.println("result is"+result[0]+","+result[1]);
        }
        else
        System.out.println("not found");
    }
    public static int[] twosum(int arr[],int target)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        //take array into map
        for(int i=0;i<arr.length;i++)
        {
            /*int val=arr[i];
            hm.put(i,val);*/
            int complement=target-arr[i];
            if(hm.containsKey(complement))
            {
                return new int[]{hm.get(complement),i };
            }
            hm.put(arr[i], i);
        }
        return null;
        //printing map
        /*for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+"  "+m.getValue());
        }*/
    }
}