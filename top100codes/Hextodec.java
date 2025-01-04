package top100codes;

public class Hextodec {
    public static void main(String[] args) {
        convert();
    }
    //converting hexadecimal to decimal
    public static void convert()
    {
       String hex="c9";
       String values="0123456789ABCDEF";
       int sum=0;
       int power=0;
       hex=hex.toUpperCase();
       for(int i=hex.length()-1;i>=0;i--)
       {
            char ch=hex.charAt(i);
            int index=values.indexOf(ch);
            sum+=(index*Math.pow(16, power));
            power++;

       }
       System.out.println("the decimal value of "+hex +" "+sum);



    }
}
