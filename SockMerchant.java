package HackerRank;

import java.util.Scanner;

public class SockMerchant {

    public static void main(String[] args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i=0;i<n;i++)
            a[i] = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if (a[i]==b[j] && count==0)
                {
                    b[i]=a[j];
                    count=1;
                }
            }
            count=0;
        }

        for (int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }
}
