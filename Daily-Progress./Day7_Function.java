// Function

//Addition using function


import java.util.Scanner;

public class Func_sum {

    public static void sum(int x,int y){
        int sum=x+y;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int add=a+b;
        System.out.println("sum of a and b is: "+add);
    }
 }

//Program to find sum of first n natural numbers
public class SumOfNaturalNumbers {

    // Function to calculate sum of first n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n > 0) {
            int sum = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }

        scanner.close();
    }
}

//swapping
public class Swap {

    public static void swap(int a, int b){

        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+  "b="+b);
    }
    public static void main(String[] args) {
        
        int a=9;
        int b=2;
        swap(a, b);    
    }
}

//Multiplication 
public class Product {

    public static int factorial(int n){
        int f=1;

        for (int i = 1; i<=n; i++) {
            f=f*i;
        }
        return f;
    }

    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        int a=8;
        int b=10;
        int prod=multiply(a, b);
        System.out.println("Multiplication is:"+prod);
    }

}
//Factorial
public class Fact {


    public static int factorial(int n){
        int f=1;

        for (int i = 1; i<=n; i++) {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        
        System.out.println("Factorial is: "+factorial(5));
    }

}

//Bionominal coefficient 
class Bionominal{
    public static int factorial(int n){
        int f=1;

        for (int i = 1; i<=n; i++) {
            f=f*i;
        }
        return f;
    }
public static int BinoCoofi(int n,int r){
    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_nmr=factorial(n-r);

    int biocoffi=fact_n/(fact_r*fact_nmr);
    return biocoffi;
}
public static void main(String[] args) {
    System.out.println(BinoCoofi(5, 2));
}

}
