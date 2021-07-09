package non_java;

import java.util.Scanner;

public class AllPrimeNum
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");

        while(sc.hasNext())
        {
            if(sc.hasNextInt())
                break;
            System.out.println("Enter proper number");
            sc.next();
        }

        int n = sc.nextInt();

        printAllPrimeNum(n);


    }

    private static void printAllPrimeNum(int n)
    {
        if(n<2)
            System.out.println("No prime numbers found till "+n);
        System.out.println("Prime Numbers : ");

        int flag;
        for(int i=2;i<=n;i++)
        {
            flag=0;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }

            if(flag==0)
                System.out.println(i);
        }
    }
}
