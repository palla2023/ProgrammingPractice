package HackerRank;

import java.util.Scanner;

public class Factorial {
public static void main(String args[])
{
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int factorial = 1;
    if(a==0)
    {
        System.out.println("1");
    }
    else
    {
        for(int i=1;i<=a;i++)
        {
            factorial *= i;
        }
        System.out.print(factorial);
    }

}
}
