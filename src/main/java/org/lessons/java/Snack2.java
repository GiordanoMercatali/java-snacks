package org.lessons.java;
import java.util.Scanner;
public class Snack2 {
    public static void main(String[] args) {
        String[] names = {
            "Mark",
            "Paul",
            "Jack",
            "Frank",
            "Bob"
        };

        String[] surnames = {
            "Black",
            "Jones",
            "Smith",
            "Williams",
            "Brown"
        };

        String[] guestsList = new String[10];

        for (int i = 0; i < guestsList.length; i++) {
            int randomName = (int)(Math.random() * names.length); 
            int randomSurame = (int)(Math.random() * surnames.length); 
            guestsList[i] = names[randomName] + " " + surnames[randomSurame];
            System.out.println("This guest's name is " + guestsList[i]);
            // System.out.println(names[(int)Math.random() * 2].concat(surnames[(int)Math.random() * 2]));
        }
    }
}
