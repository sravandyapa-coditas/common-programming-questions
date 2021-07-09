package non_java;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter
{
    public static char findFirstNonRepeatingChar(String str)
    {
        if(str==""||str==null)
            return ' ';
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : str.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.replace(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }

        for(char ch : str.toCharArray())
        {
            if(map.get(ch)==1)
                return ch;
        }
        return ' ';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Char is : "+findFirstNonRepeatingChar(str));

    }
}
