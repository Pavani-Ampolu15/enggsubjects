//package arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class rotatebydplaces
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        /*ArrayList<Integer> res=rotation(arr,d);
        Iterator itr=res.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    public static ArrayList<Integer> rotation(int arr[],int d)
    {
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=d;i<arr.length;i++)
        {
            temp.add(arr[i]);
        }
        for(int i=0;i<d;i++)
        {
            temp.add(arr[i]);
        }
        return temp;
    }*/
        int res[]=rotation(arr,d);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }
    public static int[] rotation(int arr[],int d)
    {
        int temp[]=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++)
        {
            arr[i-d]=arr[i];
        }
        for(int i=arr.length-d;i<arr.length;i++)
        {
            arr[i]=temp[i-(arr.length-d)];
        }
        return arr;
    }
}