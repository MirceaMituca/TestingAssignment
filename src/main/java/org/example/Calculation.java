package org.example;

import java.util.Objects;

import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

public class Calculation {

    private String measurement;
    private String operation;
    private int distance;

    public Calculation(String measurement, String operation, int distance) {
        this.measurement = measurement;
        this.operation = operation;
        this.distance = distance;
    }

    private int Conversion( int distance, String measurement){
        switch (measurement){
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

    public int operationCalculation(List<Calculation> distances){
        int totalCalculatedValue = 0;

        for(Calculation distance : distances);

            }


        }
    }









    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculation that = (Calculation) o;
        return getDistance() == that.getDistance() && Objects.equals(getMeasurement(), that.getMeasurement()) && Objects.equals(getOperation(), that.getOperation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMeasurement(), getOperation(), getDistance());
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "measurement='" + measurement + '\'' +
                ", operation='" + operation + '\'' +
                ", distance=" + distance +
                '}';
    }


}
