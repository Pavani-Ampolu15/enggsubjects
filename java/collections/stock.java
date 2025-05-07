package collections;
import java.util.*;
public class stock
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> stocks=new HashMap<>(n);
        /*stocks.put(0,2);
        stocks.put(1,1);
        stocks.put(2,8);
        stocks.put(3,6);
        stocks.put(4,7);
        stocks.put(5,9);*/
        //for(Map.Entry<Integer,Integer> m:stocks.entrySet())
        for(int i=0;i<stocks.size();i++)
        {
            int key=sc.nextInt();
            int value=sc.nextInt();
            stocks.put(key,value);
        }
        for(Map.Entry m:stocks.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}