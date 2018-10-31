package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {

    public Fahrenheit(float t) {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = (this.getValue() - 32) / 9 * 5;
        return new Celsius(value);
    }

    public String toString() {
        // TODO: Complete this method
        return this.getValue() + " F";
    }
}
