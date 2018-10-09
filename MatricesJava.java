package HackerRank;

import java.lang.*;
        import java.util.*;

public class  MatricesJava
{

    public static void main(String args[])
    {
        int limit=0,sum=0,max=-999999;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                a[i][j] = sc.nextInt();
        }
        int row =0,coloumn=1;
        int arlimi = 3;
        while(row!=(n-2))
        {
            for(int i=row;i<(row+3);i++)
            {
                for(int j=limit;j<arlimi;j++)
                {
                    if (i==coloumn)
                    {
                        if ((i==coloumn&&j==limit)||(i==coloumn&&j==limit+2))
                            continue;
                    }
                    sum += a[i][j];
                }
            }
            if (sum>max)
                max = sum;
            sum=0;
            arlimi++;
            if (arlimi>m)
                arlimi=3;
            limit++;
            if (limit==(m-2))
            {
                row++;
                coloumn++;
                limit=0;
            }
        }
        System.out.println(max);
    }
}