import java.util.Scanner;
class chocolate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0,j=n-1;i<j;)
        {
            
                if(arr[i]==0 && arr[j]==0)
                {
                    j--;
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                else if(arr[i]==0 && arr[j]!=0)
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                else
                i++;
            
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}