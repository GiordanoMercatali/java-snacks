package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("String: ");
        String stringToCheck = myScanner.nextLine();

        char[] charArray = stringToCheck.toCharArray();
        // System.out.println(charArray.length);

        char[] reversedArray = new char[charArray.length];
        // System.out.println(reversedArray.length);

        for (int i = charArray.length - 1; i >= 0; i--) {
            // System.out.println(charArray.length - i);
            // System.out.println(i);
            System.out.println(charArray[i]);
            reversedArray[charArray.length - 1 - i] = charArray[i];
        }
        // System.out.println(charArray);
        // System.out.println(reversedArray);

        // if (charArray == reversedArray) {
        //     System.out.println("Palindrome");
        // } else{
        //     System.out.println("Not palindrome");
        // }
        
       for (int i = 0; i < charArray.length; i++) {
        if ((charArray[i] == reversedArray[i]) && (i == charArray.length - 1)) {
            System.out.println("Palindrome");
        } else if((charArray[i] != reversedArray[i])){
            System.out.println("Not palindrome");
            break;
        }
       }
    }
}
