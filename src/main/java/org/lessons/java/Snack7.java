package org.lessons.java;

import java.util.Scanner;

public class Snack7 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many seconds?");
        double seconds = Double.parseDouble(myScanner.nextLine());
        // double seconds = 4545;
        int hours = (int) seconds / 3600;
        double remainingSeconds = seconds % 3600;
        int minutes = (int) remainingSeconds / 60;
        remainingSeconds = remainingSeconds % 60;
        // System.out.println(remainingSeconds);

        System.out.println(hours + ":" + minutes + ":" + (int)remainingSeconds);
        
    }
}
