package non_java;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter String2 : ");
        String s2 = sc.nextLine();

        System.out.println(isAnagram(s1,s2));

    }

    private static boolean isAnagram(String s1, String s2)
    {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char ch : s1.toCharArray())
        {
            if(map1.containsKey(ch))
            {
                map1.replace(ch,map1.get(ch)+1);
            }
            else
            {
                map1.put(ch,1);
            }
        }

        for(char ch : s2.toCharArray())
        {
            if(map2.containsKey(ch))
            {
                map2.replace(ch,map2.get(ch)+1);
            }
            else
            {
                map2.put(ch,1);
            }
        }


        for(char ch : map1.keySet())
        {
            if(!map2.containsKey(ch)&&!(map2.get(ch)==map1.get(ch)))
            {
                return false;
            }
        }

        return true;
    }
}
