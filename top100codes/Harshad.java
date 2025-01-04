package top100codes;

import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        if(checknum())
        {
            System.out.println("it is a Harshad number");
        }
        else
        {
            System.out.println("it is not a harshad number");
        }
    }
    public static boolean checknum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to check");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0)
        {
            int rem=temp%10;
            sum+=rem;
            temp/=10;

        }
        return (num%sum==0);
    }
}
