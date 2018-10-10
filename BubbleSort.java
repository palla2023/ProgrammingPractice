import java.util.Scanner;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int swap,count,swapped = 0;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        //For no.of Test cases
        for (int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int j=0;j<n;j++)
                a[j] = sc.nextInt();
            count  = 0;
            //For Sorting the elements by using Bubble Sort Algorithm
            for (int j=0;j<n;j++)
            {

                for (int k=0;k<n-1;k++)
                {
                    if (a[k]>a[k+1])
                    {
                        swap = a[k];
                        a[k] = a[k+1];
                        a[k+1] = swap;
                        count++;
                        swapped=1;
                    }
                }
                //For checking the elements are need to be sort or already in sorted order
                if (swapped==0)
                    break;
            }
            System.out.println();
            //Printing the sorted array
            /*for (int k=0;k<n;k++)
                System.out.print(a[k]+" ");*/

            //Printing no.of swaps
            if(swapped==0)
                System.out.print("0");
            else
                System.out.print(count);
        }
    }
}
