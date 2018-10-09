package HackerRank;

import java.lang.*;
import java.util.*;

public class NewChaos
{
   private void sort(int n,int []arr)
    {
        int count=0,temp=0;
        int fmid = n/2;
        int org[] = new int[n];

        for (int i=0;i<n;i++)
            org[i] = arr[i];
        for (int i = 0; i < n; i++)
        {
            for (int j =0; j < n; j++)
            {
                if (arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }
        }
        if (count>n*2)
            System.out.println("Too Chaotic");
        else
            System.out.println(count);
        }
//        minimumBride(n,arr,fmid,org);


 /*   void minimumBride(int n,int[] a,int fmid,int []org)
    {
        int count=0,temp=0;
        int mid = a[n/2];
        for (int i=0;i<n;i++)
        {
            if (a[i]==org[i])
                System.out.print(0);
        }
        if (a[mid]!=org[mid])
        {
            for (int i=0;i<n-1;i++)
            {
                if (org[i]>org[i+1])
                {
                    temp = org[i];
                    org[i] = org[i+1];
                    org[i+1] = temp;
                    count++;
                }
            }
        }
    }
    */

    public static void main(String args[])
    {
        NewChaos pass = new NewChaos();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while (t!=0)
        {
            n = sc.nextInt();
            int[] a = new int[n];
            for (int i=0;i<n;i++)
                a[i] = sc.nextInt();
           pass.sort(n,a);
        t--;
        }
    }
}
