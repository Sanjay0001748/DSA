package Arrays;

public class maxsumarray {

    public static int max(int[] arr) {
        // [2,-3,4,5]
        int maxsofar = arr[0];
        int currentmax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentmax = Math.max(arr[i], currentmax + arr[i]);
            maxsofar = Math.max(maxsofar, currentmax);
        }
        return maxsofar;

    }
    public static void main(String[] args) {
        int[] arr={2,-3,4,5};
        System.out.println(max(arr));
    }
}
