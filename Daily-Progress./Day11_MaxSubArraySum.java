
public class MaxsubarraySum {
   
  //Brute force

    public static void maxSubArraysum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }

        }
        System.out.println("max sum of sub array = " + maxSum);
    }
    public static void main(String[] args) {
        int[] numbers={-2,-3,4,-2,-1,1,5,-3};
        kadanes(numbers);
    }
}

