public class Pascal
{
    public static void main(String[] args) {
        triangle(4);
    }
    public static int factorial(int i)
    {
        if(i==0)
        {
            return 1;
        }
        return i*factorial(i-1);

    }
    public static void triangle(int n)
    {
        int rows=n;
        for(int i=0;i<=rows;i++)
        {
            //for printing spaces
            for(int j=0;j<=rows-i-1;j++)
            {
                System.out.print(" ");
            }
            //logic part
            
                for(int column=0;column<=i;column++)
                {
                    System.out.print(" "+ (factorial(i)/((factorial(i-column))*factorial(column))));
                }
                System.out.println();
        }
    }
}
