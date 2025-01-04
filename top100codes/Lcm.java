package top100codes;

public class Lcm {
    public static void main(String[] args) {
        //in this demo we are finding lcm by linear time
        System.out.println("the lcm is "+findLcm(2, 3));
    }
    public static int findLcm(int num1,int num2)
    {
        int max=Math.max(num1, num2);
        int lcm=0;
        for(int i=max;i<=num1*num2;i++)
        {
            if(i%num1==0 && i%num2==0)
            {
                lcm=i;
                break;
            }
        }
        return lcm;
    }
}
