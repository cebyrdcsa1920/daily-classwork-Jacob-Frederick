import java.awt.Color;
public class BluePet
{
    private Color color;
    private int legs;
    private double weight;
    private String species;

    public BluePet()
    {
        color = Color.BLUE;
        legs = 3;
        weight = 2.0;
        species = "uhhhhhh";
    }

    public BluePet(Color color, int legs, double weight, String species)
    {
        this.color=color;
        this.legs=legs;
        this.weight=weight;
        this.species=species;
    }
    public void eat(double food)
    {
        weight += food;
    }
    public double getWeight()
    {
        return weight;
    }
}