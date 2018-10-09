package HackerRank;

import java.util.Scanner;

public class Compare {
    public static void main(String args[]){
        double a = 10.23;
        System.out.println(a);
        Scanner sc =new Scanner(System.in);
        int b = sc.nextInt();
         if (a == b)
         {
            System.out.println("Matched");
         }
         else
             System.out.println("Not");
    }
}
