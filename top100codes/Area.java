package top100codes;

public class Area {
    public static void main(String[] args) {
        circle(5);
    }
    public static void circle(double num)
    {
        final double PI=3.14;
        double radius=num;
        double result=PI*(radius*radius);
        System.out.println(result);
    }
}
