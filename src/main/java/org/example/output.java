package org.example;

public class output {
    private static final String jobName = inputVariables.inputJobName();
    private static final double materialCost = inputVariables.inputCostOfMaterials();
    private static final double laborHours = inputVariables.inputLaborHours();
    private static final int laborRate = 55;
    private static final double laborCost = calcs.calculateLaborCost();
    private static final double travelHours = inputVariables.inputTravelHours();
    private static final double travelRate = 14.77;
    private static final double travelCost = calcs.calculateTravelCost();
    private static final double totalCost = calcs.calculateTotalCost();
    public static void outputData() {
        System.out.println("Job name: " + jobName);
        System.out.println("Material cost: $" + materialCost);
        System.out.println("Labor hours: " + laborHours);
        System.out.println("Labor rate: $" + laborRate + "/hr");
        System.out.println("Labor total: $" + laborCost);
        System.out.println("Travel hours: " + travelHours);
        System.out.println("Travel rate: $" + travelRate + "/hr");
        System.out.println("Travel total: $" + travelCost);
        System.out.println("Total estimate cost: $" + totalCost);
    }
}
