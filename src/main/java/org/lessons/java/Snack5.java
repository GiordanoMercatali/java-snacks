package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Write a string using letters, numbers and symbols too: ");
        String stringToCheck = myScanner.nextLine();

        if (stringToCheck == "0") {
            System. exit(0);
        } else{
            int n = 0;
            int l = 0;
            int s = 0;

            char[] charArray = stringToCheck.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if(charArray[i] >= '0' & charArray[i] <= '9'){
                    // System.out.println("Number");
                    n++;
                } else if((charArray[i] >= 'a' & charArray[i] <= 'z') || (charArray[i] >= 'A' & charArray[i] <= 'Z')){
                    // System.out.println("Letter");
                    l++;
                } else{
                    // System.out.println("Not alphanumeric");
                    s++;
                }
            }
            System.out.println("In " + stringToCheck + " there are: ");
            System.out.println(n + " numbers");
            System.out.println(l + " letters");
            System.out.println(s + " not alphanumeric symbols");
        }
    }
}
