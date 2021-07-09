package non_java;

import java.util.Scanner;

public class CountCharacter
{
    public static int charCount(String str, char ch)
    {
        int count=0;
        for(char c : str.toCharArray())
        {
            if(c==ch)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.print("Enter Char : ");
        char ch = sc.next().charAt(0);
        System.out.println("charCount of "+ch+" in "+str+" is "+charCount(str,ch));

    }
}
