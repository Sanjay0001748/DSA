public class Array {
    public static void main(String[] args) {
        int[] arr={10,2,6,3,4};
        int[] res=prod(arr);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }

    //here we finding the product of the array ecxept itself
    public static int[] prod(int[] arr)
    {
        int n=arr.length;
        int[] result=new int[n];
        int product=1;
        //10,29,34,6,20
      

        for(int i=0;i<n;i++)
        {
            int num=arr[i];
            product=1;
            for(int k:arr)
            {
                if(k!=num)
                {
                    product=product*k;
                    result[i]=product;
                
             
                }
                
            }

        }
        return result;

    }

}
