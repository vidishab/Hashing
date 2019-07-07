import java.util.Hashtable;

public class remove_characters_from_string {
    public static void main(String args[])
    {
        Hashtable<Character,Integer> ht = new Hashtable<>();
        String arr="rahuljayanth";
        String rem="jayan";
        char res[]=new char[arr.length()];
        for(int i=0;i<rem.length();i++)
        {
            res[i]=rem.charAt(i);
            ht.put(rem.charAt(i),1);
        }
        for(int i=0;i<arr.length();i++)
        {
            if(ht.containsKey(arr.charAt(i)))
            {
                int r = ht.get(arr.charAt(i));
                if(r==1)
                    continue;
            }
            else
                System.out.print(arr.charAt(i));
        }

    }
}

