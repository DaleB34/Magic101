public class Griffin extends MagicAnimal
{
    private int wings;
    private int talonShrp;

    public Griffin(String name, String type, String element, int speed, int weight, int wings, int talonShrp)
    {
        super(name, type, element, speed, weight);
        this.wings = wings;
        this.talonShrp = talonShrp;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n"
                + "Number of Wings: " + wings + "\n"
                + "Sharpness of Talons: " + talonShrp;

    }
}
