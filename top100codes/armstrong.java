package top100codes;

public class armstrong {
    public static void main(String[] args) {
        System.out.println(checkarmstrong(371));
    }

    public static boolean checkarmstrong(int num) {

        String str = String.valueOf(num);
        int length = str.length();
        int temp=num;
        int sum=0;
        while(temp>0)
        {
            int rem=temp%10;
            sum+=Math.pow(rem, length);
            temp/=10;
        }

        return num==sum;
        

    }
}
