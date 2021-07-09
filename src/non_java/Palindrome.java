package non_java;

import java.util.*;

public class Palindrome
{
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public boolean checkPalindrome()
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }

    public static boolean checkPalindrome(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Palindrome p = new Palindrome();
        System.out.print("Enter String : ");
        p.setStr(sc.nextLine());

        System.out.println(p.checkPalindrome());

    }
}
