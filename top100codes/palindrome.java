package top100codes;
public class palindrome {
    public static void main(String[] args) {
        System.out.println(checkpalindrome(123));
    }
    public static boolean checkpalindrome(int num)
    {
        int temp=num;
        int sum=0;
        int facorial=1;
        while(temp>0)
        {
            int rem=temp%10;
            facorial=1;
            for(int i=1;i<=rem;i++)
        {
            facorial=facorial*i;
            
        }
            sum=sum+facorial;
            temp=temp/10;

        }
        return (num==sum);

    }
}
