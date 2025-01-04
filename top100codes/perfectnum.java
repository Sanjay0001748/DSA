package top100codes;

public class perfectnum {
    public static void main(String[] args) {
        perfectnum.checkperfect(28);
    }
    public static void checkperfect(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(num==sum)
        {
            System.out.println(num +" it is a perfect number ");
        }
        else
        {
            System.out.println("it is not a perfect number");
        }
    }
}

