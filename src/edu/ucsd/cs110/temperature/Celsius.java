package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = ((this.getValue() - 32) * 5)/9;
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        float value = (this.getValue()*9/5) + 32;
        return new Fahrenheit(this.getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue()+" C";
    }
}
