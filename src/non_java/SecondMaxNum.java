package non_java;

public class SecondMaxNum
{
    public static Integer findSecondMax(int [] arr)
    {
        if(arr==null||arr.length==0)
            return null;
        int firstMax=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(firstMax<arr[i])
                firstMax=arr[i];

        }

        int secondMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(secondMax<arr[i]&&firstMax!=arr[i])
                secondMax=arr[i];

        }

        if(secondMax==Integer.MIN_VALUE)
            return null;

        return secondMax;

    }

    public static void main(String[] args) {

        int [] arr = {4,2,6,1,3,7,5};
        System.out.println("Second Max Number in Array : "+findSecondMax(arr));

    }
}
