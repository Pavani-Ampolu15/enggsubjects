package collections;
import java.util.*;
public class hasmapfreq
{
    public static void main(String args[])
    {
        String s="NAME IS NANI";
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',10);
        map.keySet();
        for(int i=0;i<s.length()-1;i++)
        {
             if(map.containsKey(s.charAt(i)))
             {
                Integer integer=map.get(s.charAt(i));
                map.put(s.charAt(i),++integer);
             }
             else 
             {
                map.put(s.charAt(i),1);
             }
        }
        Iterator<Character> it=map.keySet().iterator();
        while(it.hasNext())
        {
            char key=it.next();
            System.out.println(key+" "+map.get(key));
        }
        int firstfrequent=Integer.MIN_VALUE,secondfreq=Integer.MIN_VALUE;
        char firstfeqchar='\0',secondfreqchar='\0';
        for(Map.Entry<Character,Integer> entry:map.entrySet()) 
        {
            int freq=entry.getValue();
            if(freq>firstfrequent)
            {
                secondfreq=firstfrequent;
                secondfreqchar=firstfeqchar;
                firstfrequent=freq;
                firstfeqchar=entry.getKey();
            }
            else if (freq > secondfreq && freq != firstfrequent) {
                secondfreq = freq;
                secondfreqchar = entry.getKey();
            }
        }
        if (firstfeqchar != '\0') {
            System.out.println("The second most frequent character is: " + firstfeqchar + " with frequency " + firstfrequent);
        } else {
            System.out.println("There is no second most frequent character.");
        }
        if (secondfreqchar != '\0') {
            System.out.println("The second most frequent character is: " + secondfreqchar + " with frequency " + secondfreq);
        } else {
            System.out.println("There is no second most frequent character.");
        }
        System.out.println(map); 
        System.out.println(map.keySet());
    }
}