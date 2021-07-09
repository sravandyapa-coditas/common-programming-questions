package non_java;

import java.util.Scanner;

public class PowerOfTwo
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        while(sc.hasNext())
        {
            if(sc.hasNextInt())
                break;
            System.out.println("Please enter a proper number");
            sc.next();
        }
        int n = sc.nextInt();

        System.out.println(n+" is power of 2 is "+isPowOfTwo(n));



    }

    private static boolean isPowOfTwo(int n)
    {
        if(n<0)
            n=-n;
        int noOfBits =(int)(Math.floor(Math.log(n)/Math.log(2))+1);

        return n==(1<<noOfBits);
    }
}
