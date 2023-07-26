package com.julio.app.datetime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateAge {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Date of birth");

        String dob = myObj.nextLine();  // Read user input


        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dobDf = LocalDate.parse(dob, df);

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // calculate age
        int edad = calAge(dobDf, currentDate);

        // print result
        System.out.println("Your age is: " + edad + " years");

    }

    public static int calAge(LocalDate dob, LocalDate currentDate) {
        return Period.between(dob, currentDate).getYears();
    }
}
