import java.util.Hashtable;
import java.util.Iterator;

public class first_non_repeated_char {
    public static void main(String args[])
    {
        String str="abcdeedb";
        Hashtable<Character,Integer> ht = new Hashtable<>();
        for(int i=0;i<str.length();i++)
        {
            if(ht.isEmpty())
            {
                ht.put(str.charAt(i),1);
                continue;
            }
            else if(ht.containsKey(str.charAt(i)))
            {
                int p = ht.get(str.charAt(i));
                p=p+1;
                //System.out.println("P : " + p);
                ht.replace(str.charAt(i),p);
                //System.out.println(ht.get(str.charAt(i)));
            }
            else
                ht.put(str.charAt(i),1);
        }
        for(int i=0;i<ht.size();i++)
        {
            if(ht.get(str.charAt(i))==1)
            {
                System.out.println("First non-repeating character " + str.charAt(i));
                break;
            }
        }
        for(int i=0;i<ht.size();i++)
        {
            if(ht.get(str.charAt(i))==2)
            {
                System.out.println("First repeating character " + str.charAt(i));
                break;
            }
        }
    }
}

