package arrays;





public class MaximumSubarray {
    public static int kadaness(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            System.out.println(currSum);
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]  = {10,20,-8,-6,6,3,9};
        int b = kadaness(arr);
        System.out.println(b);
    }
}
