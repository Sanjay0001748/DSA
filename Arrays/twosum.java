package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {
    
    @SuppressWarnings("unchecked")
    public static int[] sum(int[] arr,int target)
    {
        Map map=new HashMap<>();
        int[] sum=new int[2];
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(target-arr[i]))
            {
                map.put(arr[i], i);
            }
            else
            {
                sum[1]=i;
                sum[0]=(int) map.get(target-arr[i]);
            }
        }
        return sum;
        
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,5,7,8,9};
        int[] result=sum(arr, 7);
        System.out.println(Arrays.toString(result));
        //expexted result=(0,3)
    }
}
