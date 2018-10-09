package HackerRank;

import java.util.*;
import java.lang.*;

class Solution {
    public static void main(String args[])
    {
        long box=0L,gold,goldenbox = 0L;
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long arr[] = new long[2];
        while (t!=0)
        {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long s = sc.nextLong();
            for (long i=0L;i<s;i++)
            {
                while(box!=2)
                {
                    arr[(int) box] = sc.nextInt();
                    box++;
                }
                if (arr[0]<=n && arr[1]<=n)
                {
                    if (arr[0]==x)
                    {
                        gold = arr[1];
                        goldenbox = gold;
                    }
                    if (arr[1]==x)
                    {
                        gold = arr[0];
                        goldenbox = gold;
                    }
                    x = goldenbox;
                }
                box = 0;
            }
            t--;
            System.out.println(goldenbox);
        }
    }
}
