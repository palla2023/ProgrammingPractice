package HackerRank;

import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class Codegon {

    public static void main(String args[])
    {
        int maximum,minimum,min=9999,max=0,acount=0,bcount=0,count=0,count1=0;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a[] = new int[5];
        int b[] = new int[5];
        while (t!=0)
        {
            for (int k=0;k<5;k++)
            {
                a[k] = sc.nextInt();
                b[k] = sc.nextInt();
                minimum = min(a[k],b[k]);
                maximum = max(a[k],b[k]);
            if (minimum<min)
                min = minimum;
            if (maximum>max)
                max = maximum;
            }
            for (int j=min;j<max;j++)
            {
                acount = 0;
                for (int m =0;m<5;m++)
                {
                    if (a[m]==j)
                        acount++;
                }
                if (acount==3)
                {
                    count = acount;
                    break;
                }

            }
            for (int j=min;j<max;j++)
            {
                if (count==3)
                {
                    for (int m =0;m<5;m++)
                    {
                        if (b[m]==j)
                            bcount++;
                    }
                    if (bcount==3)
                    {
                        count1 = bcount;
                        break;
                    }
                }
            }
            if (count==count1)
                System.out.println("Yes");
            else
                System.out.println("No");
            t--;
        }
    }
}
