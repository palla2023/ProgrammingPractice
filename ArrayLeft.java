package HackerRank;

import java.lang.*;
import java.util.*;
//
//public class HackerRank.ArrayLeft {
//    public static void main(String args[])
//    {
//        int temp,in=0;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int d = sc.nextInt();
//        int a[] = new int[n];
//        for (int i=0;i<n;i++)
//            a[i] = sc.nextInt();
//        while (in!=d)
//        {
//            for (int i=0;i<n-1;i++)
//            {
//                temp = a[i];
//                a[i] = a[i+1];
//                a[i+1] = temp;
//            }
//            in++;
//        }
//        for (int i=0;i<n;i++)
//            System.out.print(a[i]+" ");
//
//    }
//}
public class ArrayLeft {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            System.out.print(array[(i + d) % n] + " ");
    }
}

