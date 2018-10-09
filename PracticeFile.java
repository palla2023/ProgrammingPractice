package HackerRank;

import java.util.Scanner;

class PracticeFile {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Maths:");
        int maths = input.nextInt();
        System.out.print("Science:");
        int science = input.nextInt();
        System.out.print("Social:");
        int social = input.nextInt();
        float res = maths + science + social;
        float per = ((res / 300) * 100);
        System.out.print("Total Marks = "+(int)res+"/300"+"\n"+"Percentage = "+(int)(per) + "%\n");

        if (per >= 80 && per <= 95)

            System.out.println("Grade : A");

        else if (per >= 75 && per <= 79)

            System.out.println("Grade : B");

        else
            System.out.println("Grade : C");
    }
}