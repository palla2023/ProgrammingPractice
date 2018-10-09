
import java.util.*;
        import java.lang.*;

public class CodeForces {

    public static void main(String args[])
    {
        int min =99999,max=0,length=0,count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i =0 ;i<n;i++)
        {
            a[i] = sc.nextInt();
            if (a[i]<min)
                min = a[i];
            if(a[i]>max)
                max = a[i];
        }
        for (int i=min;i<=max;i++)
            length++;
        System.out.println(length-n);
    }
}
