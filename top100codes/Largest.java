public class Largest {
    public static void main(String[] args) {
        int[] arr={12,5,70,65};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int i:arr)
        {
            if(i<min)
            {
                secondmin=min;
                min=i;
            }
            else if(i<secondmin && i!=min)
            {
                secondmin=i;
            }
        }
        return secondmin;

    }
}
