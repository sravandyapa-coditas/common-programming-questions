package non_java;

import java.util.Scanner;

public class SwapTwoIntegers
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1 : ");
        while(sc.hasNext())
        {
            if(sc.hasNextInt())
                break;
            System.out.println("Enter proper Number");
            sc.next();
        }

        int num1 = sc.nextInt();

        System.out.println("Enter num2 : ");
        while(sc.hasNext())
        {
            if(sc.hasNextInt())
                break;
            System.out.println("Enter proper Number");
            sc.next();
        }

        int num2 = sc.nextInt();

        System.out.println("Before");
        System.out.println("num1 = "+num1+" num2 = "+num2);

        num1+=num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After");
        System.out.println("num1 = "+num1+" num2 = "+num2);

    }
}
