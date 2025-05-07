import java.util.*;
public class arraylist
{
    public static void main(String args[])
    {
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(0,34);
        a1.add(89);
        a1.add(21);
        int i;
        System.out.println("the array list:"+a1);
        Iterator<Integer> it=a1.iterator();
        Integer prev=null;
        while(it.hasNext())
        {
            Integer current=it.next();
             if(prev != null && prev.equals(current))
             {
                it.remove();
             }
             prev=current;
        }
        
    }
}