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
