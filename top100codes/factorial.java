package top100codes;
public class factorial {
    
    public static void main(String[] args) {
        System.out.println(find(5));
    }
    public static int find(int num)
    {
        int facorial=1;
        for(int i=1;i<=num;i++)
        {
            facorial=facorial*i;
            
        }
        return facorial;
    }
}
