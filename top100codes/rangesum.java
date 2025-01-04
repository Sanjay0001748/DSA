package top100codes;

public class rangesum {
    public static void main(String[] args) {
        System.out.println(find(12, 15));
    }
    public static int find(int num1,int num2)
    {
        int sum=0;
        int i;
        for( i=num1;i<=num2;i++)
        {
            sum+=i;
        }
        return sum;
    }
}
