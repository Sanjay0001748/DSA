public class Primenum {
    public static void main(String[] args) {
        find(2, 100);
    }
    public static void find(int n1,int n2)
    {
        for(int i=n1;i<n2;i++)
        {
            for(int j=n1+1;j<n2;j++)
            {
                if(i%j==0)
                {
                    break;
                }
                else
                {
                    System.out.print(i);
                }
            }
        }
    }
}
