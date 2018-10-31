package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature{
    public Fahrenheit(float t){
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float temp = (this.getValue() - 32) * 5/9;
        Temperature result = new Celsius(temp);
        return result;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    @Override
    public String toString() {
        //TODO: Complete this method
        return this.getValue()+" F";
    }
}
