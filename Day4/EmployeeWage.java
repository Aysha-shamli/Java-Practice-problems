package com.Day4;
import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();
        int attendance = random.nextInt(2);
        if (attendance == 1) {
            System.out.println("Employee is Present");
            int wagePerHour = 20;
            int hoursWorked = 8;
            int dailyWage = wagePerHour * hoursWorked;
            System.out.println("Employee's Daily Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
        }

    }
}


