package top100codes;

public class sumofdigits {
    //4567 4+5+6+7
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
    public static String sum(int num)
    {
        int temp=num;
        String sum="";
        while(temp>0)
        {
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        return sum;
    }
}
