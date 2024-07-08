package org.example;

public class calcs {
    private static final int laborRate = 55;
    private static final double laborHours = inputVariables.inputLaborHours();
    private static final double travelRate = 14.77;
    private static final double travelHours = inputVariables.inputTravelHours();
    private static final double materialCost = inputVariables.inputCostOfMaterials();
    private static final double laborCost = calculateLaborCost();
    private static final double travelCost = calculateTravelCost();
    public static double calculateLaborCost() {
        double laborCost = laborRate * laborHours;
        return laborCost;
    }
    public static double calculateTravelCost() {
        double travelCost = travelRate + travelHours;
        return travelCost;
    }
    public static double calculateTotalCost() {
        double totalCost = materialCost + laborCost + travelCost;
        return totalCost;
    }
}
