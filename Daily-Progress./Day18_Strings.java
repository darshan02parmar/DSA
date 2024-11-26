// Basics of String

import java.util.Scanner;

public class Basics {

    // charAt method
    public static void printletter(String fullname){
        for (int i = 0; i < fullname.length(); i++) {
            System.out.print(fullname.charAt(i));
        }
    }

    public static void main(String[] args) {

    //char and string creation

        char s[]={'A','B','C','D'};
        String str="Hey have a great day";
        String str1=new String("It's Okay..!!");

        System.out.println(s);
        System.out.println(str);

     // I/O strings
        System.out.println("Enter: ");
        Scanner str2=new Scanner(System.in);
        String welcome=str2.next();
        System.out.println(welcome);

        System.out.println("enter your fullname: ");
        Scanner str3=new Scanner(System.in);
        String fullname=str3.nextLine(); //nextline
        System.out.println(fullname);

    // Concatination
        System.out.println(welcome+" "+fullname);

    //lenght of string
        System.out.println("Size of fullname:"+fullname.length());

        printletter(fullname);

        String s1="okay";
        String s2="okay";
        String s3=new String("okay");

        if (s1 == s2) {
            System.out.println("equal");
        }else System.out.println("not equal");

        if (s1 == s3) {
            System.out.println("equal");
        }else System.out.println("not equal");

    // jb do string ki value k base pr comapare krna ki equal hai k nhi tb
    // .equals() use krna..

        if(s1.equals(s3)){
            System.out.println("equal");
        }else System.out.println("not equal");
    }

     // SUB STRING
        String str = "Hey have a great day";
        System.out.println(str.substring(0,3));
    }
}

// Palindrome strings

public class Palindrome {

    public static boolean ispalindrome(String str){

        for (int i = 0; i <str.length()/2 ; i++) {
            int n=str.length();
            if (str.charAt(i) != str.charAt(n-1-i)) {
                //not palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(ispalindrome(str));
    }
}
// Shortest path 

     //logic of question
/*
    N = Y+1
    S = Y-1
    E = X+1
    W = X-1
*/

public class ShortestPath {
    public static float getshortestpath(String path){
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);

            if (dir =='N') {
                y++;
            } else if (dir=='S') {
                y--;
            } else if (dir=='E') {
                x++;
            }else x--;
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getshortestpath(path));
    }

}
// Largest String
public class Largest_String {
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};

        String largest=fruits[0];
        for (int i = 1; i < fruits.length ; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
