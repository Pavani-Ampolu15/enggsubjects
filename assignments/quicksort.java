import java.util.*;
public class quicksort
{
    public static void swap(int arr[],int i,int j)
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        System.out.println("enter the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the entered array is:");
        for(int i:arr)
        {
            System.out.println(i);
        }
        quicksort(arr,0,arr.length-1);
        System.out.println("the sorted array is:");
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
    public static int quicksort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int partitionidex=partition(arr,low,high);
            quicksort(arr,low,partitionidex-1);
            quicksort(arr,partitionidex+1,high);
        }
        return 0;
    }
    public static int partition(int arr[],int low,int high)
    {
        int i=low;
        int j=high;
        int pivot=arr[low];
        while(i<j)
        {
            while(arr[i]<=pivot && i<=high)
            {
                i++;
                break;
            } 
            while(arr[j]>=pivot && j>=low)
            {
            j--;
            break;
            }
         if(i<j)
        {
            swap(arr,i,j);
        }   
        }
        
         swap(arr, low, j);
        return j;
    }
}