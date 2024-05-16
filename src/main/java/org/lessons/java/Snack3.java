package org.lessons.java;

import java.util.Scanner;

public class Snack3 {
    public static void main(String[] args) {
        // int[] n_array = {1, 2, 3, 4, 5, 6, 7};
        int[] n_array = new int[5];

        Scanner myScanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < n_array.length; i++) {
            System.out.print("Numero: ");
            n_array[i] = Integer.parseInt(myScanner.nextLine());

            if(i % 2 != 0){
                sum += n_array[i];
            }
        } System.out.println(sum);
    }

    
}
