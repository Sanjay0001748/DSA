package top100codes;

public class automorphic {
    public static void main(String[] args) {
            check(5);
        
    }
    public static boolean check(int num)
    {
        int sqrt=num*num;
        while(sqrt>0)
        {
            int rem=sqrt%10;
            if(rem==num)
            {
                System.out.println("yes");
                return true;
            }
            sqrt/=10;
        }
        return false;
    }
}
