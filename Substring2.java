package HackerRank;
//
//import java.util.Scanner;
//
//public class Substring2 {
//    public static void main(String args[])
//    {
//        int max = 97,min=122,count=0,index;
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        char[] a = new char[s.length()];
//        int n = sc.nextInt();
//        for(int i=0;i<s.length();i++)
//        {
//            if((int)s.charAt(i)>max)
//                max = (int)s.charAt(i);
//            if((int)s.charAt(i)<min)
//                min = (int)s.charAt(i);
//            a[i] = s.charAt(i);
//        }
//        for (int i=0;i<a.length-1;i++)
//        {
//            if ((int)a[i]==min)
//            {
//                index = i;
//                while (count!=n)
//                {
//                    System.out.print(a[index]);
//                    index++;
//                    count++;
//                }
//            }
//            count=0;
//        }
//        System.out.println();
//        for (int i=0;i<a.length-1;i++)
//        {
//            if ((int)a[i]==max)
//            {
//                index = i;
//                while (count!=n)
//                {
//                    System.out.print(a[index]);
//                    index++;
//                    count++;
//                }
//            }
//        }
//
//    }
//}


import java.util.Scanner;
import java.lang.*;

public class Substring2 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int max = 97,min = 122,index,count=0;
        Scanner sc = new Scanner(System.in);
        char[] a = new char[s.length()];
//        int n = sc.nextInt();
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)>max)
                max = (int)s.charAt(i);
            if((int)s.charAt(i)<min)
                min = (int)s.charAt(i);
            a[i] = s.charAt(i);
        }

        for (int i=0;i<a.length-1;i++)
        {
            if ((int)a[i]==min)
            {
                index = i;
                while (count!=k)
                {
                    // System.out.print(a[index]);
                    smallest = String.valueOf(a[index]);
                    index++;
                    count++;
                }
            }
            count=0;
        }
        System.out.println(smallest);
//        for (int i=0;i<a.length-1;i++)
//        {
//            if ((int)a[i]==max)
//            {
//                index = i;
//                while (count!=n)
//                {
//                    // System.out.print(a[index]);
//                    largest = a[index];
//                    index++;
//                    count++;
//                }
//            }
//        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}