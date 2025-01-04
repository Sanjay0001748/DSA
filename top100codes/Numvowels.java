public class Numvowels {
    public static void main(String[] args) {
        System.out.println(vowel("anOthEr"));
    }
    //calculate the number of vowels in a word
    public static int vowel(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                count++;
            }
        }
        return count;
    }
}
