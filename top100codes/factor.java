package top100codes;

public class factor {
    public static void main(String[] args) {
      check(10);
    }
    //check a number it is a factor of specific number
    public static void check(int num)
    {
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
