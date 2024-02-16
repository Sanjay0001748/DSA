package Arrays;

import java.util.HashMap;

public class proone
{
    public static int solve(int[] arr)
    {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int num:arr)
       {
           map.put(num, map.getOrDefault(num, 0)+1);
       }
       for(int i=0;i<arr.length;i++)
       {
           int num=arr[i];
           if(map.get(num)==1)
           {
            return num;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,4,2,5,2,1,5};
        System.out.println(xor(arr));
        //System.out.println(solve(arr));
    }
    //second method using xor

    public static int xor(int[] arr)
    {
        
        int sing=arr[0];
        for( int i=1;i<arr.length;i++)
        {
            sing=sing^arr[i];
        }
        return sing;
    }
}