import java.util.*;
class datastructarray2ndlargest
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            System.out.println("the array is"+arr[i]);
        }
       int largest=arr[0];
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]>largest)
        {
            largest=arr[i];
        }
       
       } System.out.println("the largest is"+largest);
       int secondlargest=-1;
       for(int i=0;i<arr.length;i++)
       {
       if(arr[i]>secondlargest && arr[i]<largest && arr[i]!=largest)
       {
        secondlargest=arr[i];
       }
       }
       System.out.println("the second largest is:"+secondlargest);
    }
}