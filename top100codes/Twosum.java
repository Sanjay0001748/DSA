public class Twosum {
    public static void main(String[] args) {
        int[] arr={1,0,2,-3,2};
        System.out.println(findsum(arr, 3));
    }
    public static boolean findsum(int[] arr,int target)
    {
        //{1,0,2,-3,2} target =-2 
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
