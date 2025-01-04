package top100codes;

public class Maximum {
    public static void main(String[] args) {
        handshake(10);
    }
    public static void handshake(int persons)
    {
        int shake=0;
        int count=1;
        for(int i=1;i<=persons;i++)
        {
            shake+=(persons-count);
            count++;
        }
        System.out.println("the maximum number of handshake is :"+ shake);
    }
}
