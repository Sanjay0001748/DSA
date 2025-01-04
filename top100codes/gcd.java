package top100codes;
public class gcd {
    public static void main(String[] args) {
        System.out.println(hcf(6, 12));
    }
    public static int hcf(int num1,int num2)
    {
        int hcf=0;
        for(int i=1;i<=Math.min(num1, num2);i++)
        {
            if((num1%i==0) && (num2%i==0))
            {
                hcf=i;
            }
        }
        return hcf;
    }
}
