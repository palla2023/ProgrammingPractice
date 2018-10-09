package HackerRank;

import java.util.*;

public class HackerRank
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++)
            a[i] = sc.nextInt();
        for (int i=0;i<n;i++)
        {
//            System.out.println("I am in");
            int b = a[i];
            if (a[i]<38)
                System.out.println(a[i]);
            else
                if (a[i]%5==0)
                    System.out.println(a[i]);
            else
            {
                while (a[i]%5!=0)
                {
                    a[i]++;
                    if ((a[i]%5==0))
                    {
                        if (a[i]>b)
                        {
                            if(a[i]-b<3)
                                System.out.println(a[i]);
                            if (a[i]-b==3||a[i]-b>3)
                                System.out.println(b);
                        }
                        if (a[i]<b)
                        {
                            if(b-a[i]<3||b-a[i]>3)
                                System.out.println(a[i]);
                            if (b-a[i]==3)
                                System.out.println(b);
                        }
                    }
                }

            }
        }

    }
}

/************ class Two *********************/

//public class HackerRank.HackerRank
//{
//    public static void main(String args[])
//    {
//        int flag=0,temp,Brides=0,Ob= 0;
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t!=0)
//        {
//            int n = sc.nextInt();
//            int a[] = new int[n];
//            for (int i=0;i<n;i++)
//                a[i] = sc.nextInt();
//            for (int i = 0; i < n - 1; i++) {
//                int index = i + 1;
//                while (index < n) {
//                    if (a[i] > a[index] && index < n) {
//                        temp = a[i];
//                        a[i] = a[i + 1];
//                        a[i + 1] = temp;
//                        i = index;
//                        Brides++;
//                    }
//                    else
//                        i = i + 1;
//                    index++;
//                }
//                Ob += Brides;
//                Brides = 0;
//            }
//        }
//        if (flag == 1)
//            System.out.println("Too chaotic");
//        else
//            System.out.println(Ob);
//        t--;
//        }
//    }


