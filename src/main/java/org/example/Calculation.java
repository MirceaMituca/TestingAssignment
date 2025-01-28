package org.example;

import java.util.List;

public class Calculation {

    private static int Conversion(int distance, String measurement) {
        switch (measurement) {
            case "MM":
                return distance;
            case "CM":
                return distance * 10;
            case "DM":
                return distance * 100;
            case "M":
                return distance * 1000;
            case "KM":
                return distance * 10000;
            default:
                System.out.println("Please insert a correct measurement type");
            return 0;
        }
    }


    public static int operationCalculation(List<Input> inputs) {
        int totalCalculatedValue = 0;
        for (Input input : inputs) {
            int valueInMm = Conversion(input.getDistance(), input.getMeasurement());

            if (input.getOperation().equals(Operations.ADDITION.name())) {
                totalCalculatedValue += valueInMm;
            } else if (input.getOperation().equals(Operations.SUBSTRACTION.name())) {
                totalCalculatedValue -= valueInMm;
            }
        }
        return totalCalculatedValue;
    }

}