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


    @Override
    public String toString()
    {
        return super.toString() + "\n"
                + "Number of Wings: " + wings + "\n"
                + "Sharpness of Talons: " + talonShrp;

    }
}
