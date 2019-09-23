public class TemperatureConverter
{
    private double temperature;
    private boolean isCelcius;

    public TemperatureConverter(double celcius)
    {
        temperature = celcius;
        isCelsius = true
    }

    public void convertToF()
    {
        if (isCelcius)
        {
            temperature = (temperature * 1.8) + 32
        }
    }

    public String toString()
    {
        String result = "the temp is" + temperature + "degrees"
        if (isCelcius)
        {
            result += "celcius"
        }
        else
        {
            result = "farenheit"
        }
    }
    return result;
}