package org.lessons.java;
// import java.util.Scanner;
public class Snack6 {
    public static void main(String[] args) {
        String stringNumber = "415";
        int result = 0;
        
        for (int i = 0; i < stringNumber.length(); i++) {
            int addNumber = stringNumber.charAt(i) - '0';
            result = result * 10 + addNumber;
            
        }System.out.println(result);
    }
}
