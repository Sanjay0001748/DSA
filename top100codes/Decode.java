package top100codes;

public class Decode {
    public static void main(String[] args) {
        decode(15);
    }
    public static void decode(int num)
    {
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s=String.valueOf(num);
        //1234
        String result="";
        for(int i=0;i<s.length();i++)
        {
            //char ch=s.charAt(i);
            int n=Character.getNumericValue(s.charAt(i));
            n--;
            result+=str.charAt(n);


        }
        System.out.println(result);
    }
}
