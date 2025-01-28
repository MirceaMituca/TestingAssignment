package org.example;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationTest extends TestCase {


    @Test
    void conversionTest(){
        assertEquals(10,Calculation.Conversion(10,"MM"));
        assertEquals(100,Calculation.Conversion(10,"CM"));
        assertEquals(1000,Calculation.Conversion(10,"DM"));
        assertEquals(10000,Calculation.Conversion(10,"M"));
        assertEquals(100000,Calculation.Conversion(10,"KM"));
        assertEquals(0,Calculation.Conversion(10,"MILES"));
    }

    @Test
    void operationCalculation(){
        List<Input> inputs = new ArrayList<>();

        inputs.add(new Input("KM", "ADDITION", 20));
        inputs.add(new Input("CM", "SUBSTACTION", 10));
        inputs.add(new Input("MM", "ADDITION", 20));

        int finalResult = Calculation.operationCalculation(inputs);

        assertEquals(200020,finalResult);
    }

}