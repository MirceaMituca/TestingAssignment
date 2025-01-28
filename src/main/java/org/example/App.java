package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 write a calculator that is capable of computing a metric distance value from an expression that contains
 different scales and systems.
 only addition and subtraction is allowed
 implement the calculator and write UNIT TESTS that prove that the computations are correct.

 supported formats: mm, cm, dm, m, km
 output is in lowest unit, expression: 10 cm + 1 m - 10 mm = 1090 mm


 substantiv
 calculator

 */

public class App 
{
    public static void main( String[] args )
    {
        List<Input> distances = new ArrayList<>();

        distances.add(new Input(Measurements.MM.name(),Operations.ADDITION.name(),5));
        distances.add(new Input(Measurements.CM.name(),Operations.SUBSTRACTION.name(),10));
        distances.add(new Input(Measurements.DM.name(),Operations.ADDITION.name(),15));
        distances.add(new Input(Measurements.M.name(),Operations.SUBSTRACTION.name(),7));
        distances.add(new Input(Measurements.KM.name(),Operations.ADDITION.name(),9));

        Calculation finalCalculation = new Calculation();
            int totalDistanceValueInMM = Calculation.operationCalculation(distances);

        System.out.println( "The total calculated millimeter value is " + totalDistanceValueInMM);

    }
}
