package HackerRank;

import java.util.Scanner;
import java.lang.*;

public class Length {
    public static void main(String args[])
    {
        int i =0 ;
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char sam = '\0';
        String str = s + sam;
        while (str.charAt(i)!='\0')
        {
            if (str.charAt(i)=='\0')
            {
                break;
            }
                i++;
        }
        System.out.println(i);
    }
}