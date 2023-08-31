public class Griffin extends MagicAnimal
{
    private int wings;
    private int talonShrp;

    public Griffin(String name, String type, String element, int speed, double health, int wings, int talonShrp)
    {
        super(name, type, element, speed, health);
        this.wings = wings;
        this.talonShrp = talonShrp;
    }

    //Brain Methods
    public double wingSlap()
    {
        return (wings * 0.1) * health;
    }

    public double scratch()
    {
        return (talonShrp * 0.13) * health;
    }

    @Override
    public double attack()
    {
        //i felt like griffins needed a little buff
        return (scratch() + wingSlap()) * 1.001 ;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n"
                + "Number of Wings: " + wings + "\n"
                + "Sharpness of Talons: " + talonShrp;

    }
}
