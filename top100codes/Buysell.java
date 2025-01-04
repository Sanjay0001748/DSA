public class Buysell {
    public static void main(String[] args) {
        //best time to buy and sell the stock
        int[] arr={7,3,2,6,9,5,20};
        System.out.println(bestTime(arr));
        System.out.println(maxProfit(arr));
    }
    public static int bestTime(int[] arr)
    {
        //we have to return the maximum profit 
        int result=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                result=Math.max(result, (arr[j]-arr[i]));
            }
        }
        return result;
    }
    public static int maxProfit(int[] arr)
    {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i:arr)
        {
            if(i<minprice)
            {
                minprice=i;
            }
            else
            {
                int profit=i-minprice;
                if(profit>maxprofit)
                {
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;
    }
}
