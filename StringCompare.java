package HackerRank;

import java.util.*;
import java.lang.*;

public class StringCompare
{
    public static void main(String args[])
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        String input[] = new String[in];
        for (int i=0;i<input.length;i++)
            input[i] = sc.nextLine();

        int qu = sc.nextInt();
        String query[] = new String[qu];
        for (int i=0;i<query.length;i++)
            query[i] = sc.nextLine();

        for (int i = 0;i<qu;i++)
        {
            for (int j=0;j<in;j++)
            {
                if (query[i]==input[j])
                    count++;
            }
            System.out.println(count);
            count = 0;
        }
    }
}
