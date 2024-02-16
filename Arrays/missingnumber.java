package Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class missingnumber {
    
    public static int[] findmissingnumber(int[] arr,int[] brr)
    {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:arr)
        {
           int freq=map.getOrDefault(i, 0);
           freq++;
           map.put(i, freq);
        }
        //removing a element form brr
        for(int i:brr)
        {
            int freq=map.get(i);
            freq--;
            if(freq==0)
            {
                map.remove(i);
            }
            else
            {
                map.put(i, freq);
            }
        }
        int[] res=new int[map.size()];
        int i=0;
        //getting missing number in sorted form
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            
            res[i++]=e.getKey();
           

        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] brr={5,4,3};
        int[] res=findmissingnumber(arr, brr);
        System.out.println(Arrays.toString(res));
        //expected output will be 1,2
    }
}
