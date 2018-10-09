package HackerRank;

import java.util.Scanner;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int swap,count=0;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int j=0;j<n;j++)
                a[j] = sc.nextInt();
            for (int j=0;j<n;j++)
            {
                int swapped = 0;
                for (int k=0;k<n-1;k++)
                {
                    if (a[k]>a[k+1])
                    {
                        swap = a[k];
                        a[k] = a[k+1];
                        a[k+1] = swap;
                        count++;
                        swapped=1;
                    }
                }
                if (swapped==0)
                    break;
            }

//            for (int k=0;k<n;k++)
//                System.out.print(a[k]+" ");
            System.out.println();
            System.out.print(count);
        }
    }
}
