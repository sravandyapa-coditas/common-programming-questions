package com.company.cpq;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main
{

    public static int elementFrequency(int N, int M, int A[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum=0;

        for(int i : A)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }
        }

        for(int i : map.keySet())
        {
            if(map.get(i)<M)
            {
                sum+=M-map.get(i);
            }
        }

        return sum;
    }

    public static void main(String[] args)
    {
	// write your code here


    }
}
