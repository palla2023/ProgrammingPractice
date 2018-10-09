package HackerRank;
import java.util.*;

public class MinimumSwaps
{

    void miniSwaps(int n,int[] a) {
        int swap=0;
        for(int i=0;i<n-1;i++){
            if(i+1!=a[i])
            {
                int t=i;
                while(a[t]!=i+1)
                   t++;
                int temp=a[t];
                a[t]=a[i];
                a[i]=temp;
                swap++;
            }
        }
        System.out.println(swap);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i=0;i<n;i++)
            a[i] = sc.nextInt();
      MinimumSwaps obj = new MinimumSwaps();
      obj.miniSwaps(n,a);
    }
}
