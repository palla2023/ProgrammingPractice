package HackerRank;//import java.lang.reflect.Array;
import java.util.*;
class TestClass
{
    public static void main(String args[])
    {
        long T,N,A,B,i,j;
        double res;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        if (T >= 1 && T <= Math.pow(10, 5)) {
            for (i = 0; i < T; i++) {
                double min = -1;
                N = sc.nextInt();//5
                A = sc.nextInt();//1
                B = sc.nextInt();//
                if (N >= 1 && A >= 1 && B >= 1 && N<= Math.pow(10,5) && A <= Math.pow(10,5) && B <= Math.pow(10,5))
                {
                    for (j = 0; j <=N; j++)//j = 0
                    {
                        res = A * Math.pow(j, 2) + B * Math.pow((N-j), 2);//50
                        System.out.println(res+" "+min);
                        if (res<min)
                            min = res;
                        if(min == -1.0)
                            min = res;
                    }
                    System.out.println(min);
                }

            }
        }
    }
}