package top100codes;

public class evenorodd {
    public static void main(String[] args) {
        System.out.println(find(7));
    }
    public static String find(int num)
    {
        // if(num%2==0)
        // {
        //     System.out.println("even number");
        // }
        // else
        // {
        //     System.out.println("odd number");
        // }
        return num%2==0?"even":"odd";
    }
}
