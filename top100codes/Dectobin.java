package top100codes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Dectobin {
    public static void main(String[] args) {
        //converting decimal to binary
        convert(12);
    }
    public static void convert(int num)
    {
        int[] bin=new int[4];
        int index=0;
        int temp=num;
        while(temp>0)
        {
            int rem=temp%2;
            bin[index++]=rem;
            temp/=2;
        }
       
       for(int i=bin.length-1;i>=0;i--)
       {
        System.out.print(bin[i]);
       }
       
    }
}
