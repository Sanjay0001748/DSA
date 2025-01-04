package top100codes;

public class leapyear {
    public static void main(String[] args) {
        leap(2024);
    }
    public static void leap(int year)
    {
        if((year%4==0) || (year%400==0) && (year%100!=0))
        {
            System.out.println("it is a leap year");
        }
        else
        {
            System.out.println("it is not a leap year");
        }
    }
}
