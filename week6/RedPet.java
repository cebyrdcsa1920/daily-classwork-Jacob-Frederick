import java.awt.Color;
public class RedPet
{
    private Color color;
    private int legs;
    private double weight;
    private String species;

    public RedPet()
    {
        color = Color.RED;
        legs = 3;
        weight = 2.0;
        species = "uhhhhhh";
    }

    public RedPet(Color color, int legs, double weight, String species)
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