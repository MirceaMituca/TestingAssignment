package org.example;

import java.util.Objects;

public class Input {

    private String measurement;
    private String operation;
    private int distance;

    public Input (String measurement, String operation, int distance) {
        this.measurement = measurement;
        this.operation = operation;
        this.distance = distance;
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
        Input input = (Input) o;
        return getDistance() == input.getDistance() && Objects.equals(getMeasurement(), input.getMeasurement()) && Objects.equals(getOperation(), input.getOperation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMeasurement(), getOperation(), getDistance());
    }

    @Override
    public String toString() {
        return "Input{" +
                "measurement='" + measurement + '\'' +
                ", operation='" + operation + '\'' +
                ", distance=" + distance +
                '}';
    }
}
