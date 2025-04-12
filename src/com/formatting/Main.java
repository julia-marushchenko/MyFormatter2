// Program to format text with adding date and words
package com.formatting;
import java.time.LocalDate;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating date variable
        LocalDate date = LocalDate.now();

        // Formatting string with a text and date
        System.out.printf("Hello and welcome, %s! Today is %tB %<te.", "ladies and gentlmen", date);

    }
}