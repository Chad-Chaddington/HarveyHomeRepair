package org.example;

import java.util.Scanner;
public class inputVariables {
    public static String inputJobName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a job name: ");
        String jobName = scanner.nextLine();
        return jobName;
    }

    public static double inputCostOfMaterials() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the cost of materials: ");
        double materialCost = Double.parseDouble(scanner.nextLine());
        return materialCost;
    }

    public static double inputLaborHours() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the total number of labor hours: ");
        double laborHours = Double.parseDouble(scanner.nextLine());
        return laborHours;
    }

    public static double inputTravelHours() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the the total number of travel hours: ");
        double travelHours = Double.parseDouble(scanner.nextLine());
        return travelHours;
    }
}
