package HackerRank;

import java.util.Scanner;

public class Strings
{
    public static void main(String args[])
    {
//        int values = 0,left=0,right=0;
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length()+B.length());
        if (A.charAt(0)<B.charAt(0))
            System.out.println("No");
        else if (A.charAt(0)>=B.charAt(0))
            System.out.println("Yes");
        int a = A.charAt(0)-32;
        int b = B.charAt(0)-32;
//        System.out.println();
        for (int i=0;i<A.length();i++)
        {
                if (i==0)
                    System.out.print((char)a);
                else
                    System.out.print(A.charAt(i));
        }
        System.out.print(" ");
        for (int i=0;i<B.length();i++)
        {
                if (i==0)
                    System.out.print((char)b);
                else
                    System.out.print(B.charAt(i));
        }

    }
}
