package HackerRank;

import java.util.Scanner;

class Parallelogram
{
// Scanner sc = new Scanner(System.in);
 int length,width;
// int width = sc.nextInt();
    void DisplayInfo()
    {
        System.out.println(length*width);
    }
}
public class OopsPractice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Parallelogram are = new Parallelogram();
        are.length = sc.nextInt();
        are.width = sc.nextInt();
        are.DisplayInfo();
    }
}
