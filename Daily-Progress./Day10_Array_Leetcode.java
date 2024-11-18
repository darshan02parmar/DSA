//LeetCode--238 - product of array itself

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums){
        int n = nums.length; 
        int[] result = new int[n]; 
        result[0] = 1; 

      
        for (int i = 1; i < nums.length; i++) {
            // result[i] stores the product of all elements to the left of nums[i]
            result[i] = result[i - 1] * nums[i - 1];
        }

        int right = 1; 

        
        for (int i = n - 1; i >= 0; i--) {
            // Multiply the left product (already in result[i]) by the right product
            result[i] = result[i] * right;

            // Update the right product to include the current element
            right *= nums[i];
        }
        return result;
    }
}

//Leetcode--169 - Majority element

public class Majority_Element_I {

        public static int majorityElement(int nums[]){
            int n= nums.length;
            int count=0;
            Integer maj=null;

            for (int i = 0; i < n; i++) {

                if (maj != null && nums[i]==maj) {
                    count++;
                } else if (count==0) {
                    maj=nums[i];
                    count=1;
                }else {
                    count--;
                }
            }
            return maj;
        }
}
