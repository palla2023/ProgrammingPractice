package HackerRank;

import java.util.Scanner;

public class Substring {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char[] a = new char[A.length()];
        for (int i=0;i<A.length();i++)
            a[i] = A.charAt(i);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i=start;i<end;i++)
            System.out.print(A.charAt(i));
    }
}
