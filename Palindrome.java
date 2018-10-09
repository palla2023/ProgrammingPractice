package HackerRank;

import java.util.Scanner;

public class Palindrome {
    public static void main(String palla[])
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum=0,temp = a;
        while(a>0)
        {
            int r = a%10;
            sum = (sum*10)+r;
            a /= 10;
        }
        if (temp==sum)
            System.out.print("HackerRank.Palindrome");
        else
            System.out.print("Not a HackerRank.Palindrome");
    }
}
