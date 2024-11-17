
//Basic of array ( insert,delete,update)
import java.util.Scanner;

public class Intro {

    public static void insert(int marks[]){
            marks[1]=11;
    }

    public static void update(int marks[]){
        for (int i = 0; i <marks.length ; i++) {
            marks[i]=marks[i]+1;
        }
    }

    public static void delete(int marks[]){
            marks[2]=0;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] marks=new int[3];
        marks[0]=s.nextInt();
        marks[1]=s.nextInt();
        marks[2]=s.nextInt();

        insert(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+"");
        }
        System.out.println();
        update(marks);
        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]+" ");
        }
        System.out.println();

       delete(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+"");
           }
            System.out.println();
    }
}

// Linear search
public class Searching {


    public static int linearSearch(int numbers[],int key){
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,11,32,46,90};
        int key=4;
       int index= linearSearch(numbers,key);

        if (index == -1) {
            System.out.println("Not Found");
        }else {
            System.out.println("Key is at index:"+ index);
        }
    }
}
//Binary Search
public class Searching {
 public static int binarySearch(int numbers[],int key){
        int start=0;
        int end= numbers.length-1;
        int index=-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                index=mid;
                break;
            } else if (numbers[mid]<key) {
                start=mid+1;
            }else if(numbers[mid]>key){
                end=mid-1;
            }
        }
        return index;
 }
     public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60};
        int key=60;
     
       int index=binarySearch(numbers,key);
        if (index == -1) {
            System.out.println("Not Found");
        }else {
            System.out.println("Key is at index:"+ index);
        }
    }
}



//Largest & smallest element in array

public class Largest {

    public static int getLargest(int numbers[]){

        int largest=Integer.MIN_VALUE;  //-infinity
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i<numbers.length; i++) {
            if (largest < numbers[i]) {
                largest=numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest number is : "+smallest);
        return largest;

    }


    public static void main(String[] args) {
        int[] numbers={1,4,2,10,11,9};
        System.out.println("largest number is: "+getLargest(numbers));
    }
}
//Reverse Array
public class Reverse {

    public static void revrseArray(int numbers[]){
        int first=0;
        int last= numbers.length-1;

        while (first<last){

            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] numbers={2,4,6,8,10};
        revrseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
//Pairs in array
public class Pairs {
    public static void pairsArray(int numbers[]){
        int tp=0;
        for (int i = 0; i <numbers.length ; i++) {
            int current=numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("("+current + ","+numbers[j] +")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs= "+tp);
    }
    public static void main(String[] args) {
            int[] numbers={2,4,6,8,10};
            pairsArray(numbers);
    }
}

// print Sub array

public class SubArray {

    public static void printsubArray(int numbers[]){
        int ts=0;
        for (int i = 0; i < numbers.length ; i++) {
            int start=i;
            for (int j = i; j < numbers.length ; j++) {
                int end=j;
                for (int k = start; k <=end ; k++) {
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub array = "+ts);
    }

    public static void main(String[] args) {
        int[] numbers={2,4,6,8,10};
        printsubArray(numbers);
    }
}

