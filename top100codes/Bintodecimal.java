package top100codes;

import java.util.Scanner;

public class Bintodecimal {
    public static void main(String[] args) {
        //connverting binary to decimal
        convert();
    }
    public static void convert()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a binary number to convert into decimal form");
        int temp=sc.nextInt();
        int i=temp;
        int decimal=0;
        int power=0;
        while(temp>0)
        {
            int rem=temp%10;
            decimal+=rem*Math.pow(8, power);
            temp/=10;
            power++;
        }
        System.out.println("the decimal form of "+i +" is : "+decimal);
    }
}
