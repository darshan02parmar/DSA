
// primes in range (2 to n)

public class PrimesInRange {
    
    public static boolean  isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primesRange(int n){
        for (int i = 2; i <=n; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primesRange(17);
    }
}

//Binary to decimal

public class BinaryToDecimal {
        public static void bintodec(int BinNum){
            int myNum=BinNum;
            int pow=0;
            int decNum=0;

            while(BinNum>0){
                int lastDigit=BinNum%10;
                decNum = decNum+lastDigit*(int)Math.pow(2, pow);
                
                pow++;
                BinNum=BinNum/10;
               
            }
            System.out.println("decimal of "+ myNum+ "=" +decNum);
           
        }
    public static void main(String[] args) {    
            bintodec(111);

    }
}

//Decimal to binary

public class DecimalToBinary {


    public static void dectobin(int decNum){
        int myNum=decNum;
        int pow=0;
        int binNum=0;

        while (decNum>0) { 
            int rem=decNum%2;
            binNum=binNum + rem*(int)Math.pow(10, pow);

            pow++;
            decNum=decNum/2;
        }
        System.out.println("Binary of "+ myNum+ "=" +binNum);
    }
    public static void main(String[] args) {
        
        dectobin(5);
    }
}
//Avg of 3
public class AvgFunc {
    
    public static int AvgOfThree(int a,int b,int c){
        
        int avg=(a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
    
        System.out.println("Avrage of three number is "+ AvgOfThree(4, 3, 5));
    }
}
//Even Accept ,,returns true


import java.util.Scanner;

public class EvenAccept {
    
    public static boolean  isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
       

    }

public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();

    if(isEven(n)){
        System.out.println("number is even");
    }else{
        System.out.println("number is odd");
    }

}
}
//Palidrome Number


import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=s.nextInt();

        if(isPalidrome(number)){
            System.out.println(number+ " is palidrome");
        }else{
            System.out.println(number+ " is not palidrome");

        }
    }
    public static boolean isPalidrome(int n){

        int original=n;
        int reverse=0;

        while(n!=0){
            int digit=n%10;
            reverse=(reverse*10)+digit;
            n=n/10;
        }
        return original==reverse;
    }
}
//Sum of digit

import java.util.Scanner;

public class SumOfDigit {
    public static void  main(String[] args) {
        System.out.println("Enter number: ");
        Scanner s=new Scanner(System.in);

        int number=s.nextInt();

       int result=sod(number);
       System.out.println(result);
    }
    public static int  sod(int n){
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            sum+=lastdigit;
            n/=10;
        }
        return sum;
    }

}
