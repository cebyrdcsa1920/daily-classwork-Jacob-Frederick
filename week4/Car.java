import java.awt.Color;

public class Car
{
    private String model;
    private Color color;
    private int numPassengers;
    private double amountOfGas;
    private final double mpg;

    public Car()
    {
        model = "Mustang";
        color = Color.GREEN;
        numPassengers = 2;
        amountOfGas = 12.5;
        mpg = 15;
    }
    public Car(String model. Color color, int numPassengers, double amountOfGas, double mpg)
    {
        this.model = model
        this.color = color
        this.numPassengers = numPassengers
        this.amountOfGas = amountOfGas
        this.mpg = mpg
    }
    /**
     * Drives given distance
     * @param distance is distance in miles
     */
    public void drive(double distance)
    {
        amountOfGas -= distance / mpg;
    }

    public double getAmountOfGas()
    {
        return amountOfGas;
    }
    /**
     * fills gas tank
     */
    public void fillGasTank(double amount)
    {
        amountOfGas += amount;
    }


    public String toString()
    {
        return "This is My Goebel";
    }
}