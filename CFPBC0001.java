package HackerRank;

import java.util.Scanner;

public class CFPBC0001 {
    public static void main(String args[])
    {
        int pos=0,capitals=0,smalls=0,digits=0;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0)
        {
            String a = sc.nextLine();
            for (int i = 0;i<a.length();i++)
            {
                if(a.charAt(i)>'A'||a.charAt(i)<'Z')
                    capitals++;
                else if(a.charAt(i)>'a'||a.charAt(i)<'z'||a.charAt(i)>=0)
                    smalls++;
                else if(a.charAt(i)>=0)
                    digits++;
            }
            if (smalls==0||digits==0||capitals==0)
            {
                /*if(smalls==0)
                {
                    if (digits>capitals)
                    {

                    }
                }*/
                System.out.println("Not valid");
            }


        }
    }
}
