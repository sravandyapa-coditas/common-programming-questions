package non_java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutation
{
    private String str;

    public Set<String> getResult() {
        return result;
    }

    private Set<String> result = new HashSet<>();

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private String swap(String str,int index1,int index2)
    {
        char [] ch = str.toCharArray();
        char temp = ch[index1];
        ch[index1] = ch[index2];
        ch[index2] = temp;
        return String.valueOf(ch);
    }

    public void recursivePermutation(int mid, String str)
    {
        if(mid==str.length())
        {
            result.add(str);
            return;
        }

        for(int i=mid;i<str.length();i++)
        {
            recursivePermutation(mid+1,swap(str,mid,i));
        }

    }

    public void printPermutations()
    {

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Permutation p = new Permutation();

        System.out.println("Enter String : ");
        p.setStr(sc.nextLine());

        p.recursivePermutation(0,p.getStr());
        System.out.println("Permutation size : "+p.getResult().size()+"\n Strings : "+p.getResult());

    }

}
