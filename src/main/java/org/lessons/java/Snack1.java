package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Numero: ");
        int n = Integer.parseInt(myScanner.nextLine());
        
        if(n % 2 == 0){
            System.out.println(n);
        } else {
            System.out.println(n+1);
        }
    }
}