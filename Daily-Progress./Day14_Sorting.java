
public class Sorting {

// 1] Bubble Sort
  //     Time Complexity : O(n²)

    public static void BubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

  //   Time Complexity : O(n) ( Best case )

    public static void BubbleSort(int[] arr){
        boolean swappeed;
        for (int i = 0; i < arr.length-1; i++) {
            swappeed=false;

            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swappeed=true;
                }
            }
            if (!swappeed ) {
                break;
            }
        }
    }

//  2] SelectionSort
  //  Time Complexity : O(n²)
   public static void SelectionSort(int[] arr){
       for (int i = 0; i < arr.length-1 ; i++) {
           int minpos=i;

           for (int j = i+1; j < arr.length ; j++) {
               if (arr[j] < arr[minpos]) {
                   minpos=j;
               }
           }
           int temp=arr[minpos];
           arr[minpos]=arr[i];
           arr[i]=temp;
       }
   }
 public static void main(String[] args) {
        int[] arr={5,4,2,1,3};
        BubbleSort(arr);
        SelectionSort(arr);
        insertionSort(arr);
        printArray(arr);
    }
}
