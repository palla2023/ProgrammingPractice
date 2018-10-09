package HackerRank;

import java.util.Scanner;
import java.lang.*;

public class StringPalindrome {
    public static void main(String args[])
    {
     Scanner input = new Scanner(System.in);
    String reverse="",Original = input.nextLine();
    int length = Original.length();
    System.out.println(length);
    for (int i = length-1;i>=0;i--)
        reverse = reverse + Original.charAt(i);
    if (Original.equals(reverse))
        System.out.println("HackerRank.Palindrome");
    else
        System.out.println("Not a HackerRank.Palindrome");
        System.out.println(reverse);
    }
}

