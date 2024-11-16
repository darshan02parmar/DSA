
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

