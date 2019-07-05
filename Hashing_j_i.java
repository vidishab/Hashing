
import java.util.Hashtable;
import java.util.Scanner;

public class Hashing_j_i {
    public static void main(String args[])
    {
        int res=0;
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the " + i + "th element");
            int p = sc.nextInt();
            int q =sc.nextInt();
            if(ht.isEmpty())
            {
                ht.put(p,q);
                continue;
            }
            if(!ht.isEmpty() && ht.containsKey(q)==true)
            {
                res=ht.get(q);
                System.out.println(res);
            }
            if(p==res)
            {
               System.out.println(q + " " + ht.get(q) + " and " + p + " " + q);
               continue;
            }
            ht.put(p,q);
            System.out.println(ht);
        }
    }
}

