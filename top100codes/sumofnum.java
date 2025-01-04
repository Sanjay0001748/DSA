package top100codes;
public class sumofnum {
    //sum of first n natural number
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum(int num)
    {
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
}
