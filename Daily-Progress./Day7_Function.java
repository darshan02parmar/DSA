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
