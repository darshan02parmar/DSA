//leetcode 33:Search in Rotated Sorted Array

public class SearchInRotatedSortedArray {

    public static int search(int arr[],int target){
        int n= arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            int mid=(left+right)/2;

            if (arr[mid] > arr[right]) {
                left=mid+1;
            }else {
                right=mid;
            }
        }
        int shift=left;

       left=0;
       right=n-1;

       while (left<=right){
          int mid=(left+right)/2;

          int realMid=(mid+shift) % n;
           if (arr[realMid] == target) {
                return realMid;
           } else if (arr[realMid] < target) {
               left=mid+1;
           }else {
               right=mid-1;;
           }
       }
       return -1;
    }
    public static void main(String[] args) {

            int[] arr={4,5,6,7,0,1,2};
            int target=0;
        System.out.println(search(arr,4));
    }
}
