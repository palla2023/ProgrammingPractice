package HackerRank;

import java.util.*;
public class Armstrong {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double arm = 0,temp = a,Original=a;
        String s = String.valueOf(a);
        int length = s.length();
        for (int i=0;i<length;i++)
        {
            temp = a%10;
            arm += Math.pow(temp,length);
            a = a/10;
        }
        if (Original==arm)
            System.out.println("ArmStrong");
        else
            System.out.println("Not a HackerRank.Armstrong number");

    }
}