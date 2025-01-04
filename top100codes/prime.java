package top100codes;
public class prime {
    public static void main(String[] args) {
        System.out.println(checkprime(15));
    }
    public static String checkprime(int num)
    {
        if(num<2)
        {
            return "not a prime number";
        }
        boolean prime=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
                
            }
           
        }
        return prime?"prime number":"not a prime number";

    }
}
