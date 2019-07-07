import java.util.Hashtable;
import java.util.Scanner;

public class array_sum_S {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int p = sc.nextInt();
        int arr[]=new int[p];
        System.out.println("Enter the elements in array");
        for(int i=0;i<p;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the sum S to be found");
        int val=sc.nextInt();
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        ht.put(0,0);
        for(int i=1;i<arr.length;i++)
        {
            int res=val-arr[i];
            if(ht.containsKey(res))
            {
                System.out.println(arr[i] + " " +  res);
                break;
            }
            ht.put(arr[i],arr[i]);
        }
    }
}

