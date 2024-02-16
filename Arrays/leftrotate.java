package Arrays;

import java.util.Arrays;

public class leftrotate {
    
    public static int[] reverse(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end--;


        }
        return arr;
    }
    public static void rotate(int[] arr,int k)
    {
            reverse(arr, 0, arr.length-1);

            //reversing(n-k)elements
            reverse(arr, 0, (arr.length-k-1));

            //reversing k elements
          int[] res=  reverse(arr, (arr.length-k), arr.length-1);
                System.out.println(Arrays.toString(res));
            
    }



    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr, 3);
        //final output4,5,6,7,1,2,3
    }   
}
