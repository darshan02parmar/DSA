
// print number in decreasing order

public class Print_decreas {

    public static void printDec(int n){
        if (n == 1) {
            System.out.print("1");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void main(String[] args) {
        int n=10;
        printDec(n);
    }
}

// print number in increasing order

public class Print_increas {

    public static void printInc(int n){

        // Base case: If n is 1, print 1 and return
        if (n == 1) {
            System.out.print(1+" ");
            return;
        }
        // Recursive call to print numbers from 1 to n-1
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n=10;
        printInc(n);
    }
}

//Factorial of n

import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        if (n == 1 || n==0) {
            return 1;
        }else {
            return n*fact(n-1);
        }
    }
//    public static int factt(int n){
//        if(n==0){
//            return 1;
//        }
//        int fnm1=factt(n-1);
//        int fn=n*fnm1;
//        return fn;
//    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        System.out.println(fact(n));
//        System.out.println(factt(n));
    }
}

//Fibonacci series
public class Fibonacci {

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
}
// Sum of n natural number

public class SumOfNnumber {
    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = calcSum(n - 1);
        int sn = n +snm1;
        return sn;
    }

    public static void main(String[] args) {
        int n=5;

        System.out.println(calcSum(n));
    }
}

