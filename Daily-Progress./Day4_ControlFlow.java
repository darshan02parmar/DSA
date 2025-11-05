import java.util.*;

//print number from 1 to n
public class Control_flow {
    public static void main(String args[]){
        System.out.println("Enter number :");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}

// check the number is Prime or not

public class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a number:");
        int n=s.nextInt();
        if(n==2){
            System.out.println("n is prime");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("n is prime");
            }else{
                System.out.println("n is not prime");
            }
        }
    }
}

//Printing the Reverse of a Number
public class Print_reverse {
    public static void main(String[] args) {
        int n = 10392;

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;
        }
        System.out.println();
    }
}

//Reversing the Given Number
public class Reverse_givenNumber {
    public static void main(String[] args) {
        int rev = 0;
        int n = 91025;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(rev);
    }
}

//total sum of the even and odd integers

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0, oddSum = 0;

        System.out.println("Enter integers (type '0' to end):");

        while (true) {
            int num = scanner.nextInt();

            // Exit loop if the user inputs 0
            if (num == 0) {
                break;
            }

            // Check if the number is even or odd and add to respective sum
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        // Display the results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
//Factorial of n

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = s.nextInt();
        
        int fact = 1;
        
        for (int i = 1; i <= n; i++) {  
            fact *= i;
        }        
        System.out.println("Factorial of " + n + " is: " + fact);
        
        s.close(); 
    }
}
// takes a number 𝑁 from the user and prints its multiplication table

import java.util.*;
public class Multi_Table {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        for (int i = 1; i<=10; i++) {
            System.out.println(n + "*" + i + "=" + (n*i));
        }
    }
}
