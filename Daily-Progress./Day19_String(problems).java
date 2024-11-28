// Convert uppercase

public class Convert_UpperCase {
    public static String toUpperCase(String str){

      StringBuilder sb=new StringBuilder("");
      char ch=Character.toUpperCase(str.charAt(0));
      sb.append(ch);
        for (int i = 1; i <str.length() ; i++) {
            if (str.charAt(i)==' ' && str.charAt(i)>str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="have a great day..!!";
        System.out.println(toUpperCase(str));;
    }
}

// String  Compression

public class String_Compression {
    public static String compress(String str) {

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) { // Check if the current character matches the previous one
                count++;
            } else {
                // Append the previous character and its count to the StringBuilder
                sb.append(str.charAt(i - 1)).append(count);
                count = 1; // Reset the count for the new character
            }
        }
        // Add the last character and its count
        sb.append(str.charAt(str.length() - 1)).append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="aaabbccdddd";
        System.out.println(compress(str));
    }
}
// Anagrams

import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        String str1="race";
        String str2="care";

// Convert Strings to lowercase. Why? so that we don't have to check separately for lower & uppercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){

            // convert strings into char array
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // if the sorted char arrays are same or identical then the strings are areanagram
            boolean result=Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.println(str1+" and "+str2+" are anagram of eachother");
            }else {
                System.out.println(str1+" and "+str2+" are not anagram of eachother");
            }
        }else {
            System.out.println(str1+" and "+str2+" are not anagram of eachother");
        }
    }
}
