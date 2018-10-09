package HackerRank;

import java.util.Scanner;

public class HRPBC001
{
    public static void main(String args[])
    {
        int temp, count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n - 1; i++)
        {
            int index = i + 1;
            while (index < n)
            {
                if (a[i] > a[index] && index < n)
                {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    i = index;
                    count++;
                }
                else
                    i = i + 1;
                index++;
            }
        }
        System.out.println(count);
    }
}