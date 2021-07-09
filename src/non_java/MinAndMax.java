package non_java;

import java.util.Arrays;

public class MinAndMax
{
    public static int[] findMinMax(int [] arr)
    {
        if(arr==null||arr.length==0)
            return null;
        int [] result = new int[2];
        result[0]=arr[0];
        result[1]=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(result[0]>arr[i])
                result[0]=arr[i];
            else if(result[1]<arr[i])
                result[1]=arr[i];
        }
        return result;
    }
    public static void main(String[] args) {

        int [] arr = {4,5,7,6,3,2};

        System.out.println("Min and Max : "+ Arrays.toString(findMinMax(arr)));
    }
}
