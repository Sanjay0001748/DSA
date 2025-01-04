package top100codes;
public class positiveornegative
{
    public static void main(String[] args) {
        
        if(say(-7))
        {
            System.out.println("positive number");

        }
        else
        {
            System.out.println("negative number");
        }
    }
    public static boolean say(int num)
    {
        return num>0?true:false;
    }
}