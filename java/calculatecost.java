import java.util.HashSet;
import java.util.Set;
import java.util.*;
class calculatecost{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int x=100;
        int costl=cost(prices,k,x);
        System.out.println(costl);
    }
    public static int cost(int prices[],int k,int x)
    {
        Set<Integer> distinctprices=new HashSet<>();
        int totalcost=0;
        for(int price:prices)
        {
            //int value=prices[i];
            if(!distinctprices.contains(price))
            {
                distinctprices.add(price);
            }
            if(distinctprices.size()>k)
            {
                totalcost+=x;
            }
        }
        return totalcost;
    }
}
