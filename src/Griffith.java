public class Griffith extends MagicAnimal
{
    private int wings;
    private int talonShrp;

    public Griffith(String name, String type, String element, int speed, int weight, int wings, int talonShrp)
    {
        super(name, type, element, speed, weight);
        this.wings = wings;
        this.talonShrp = talonShrp;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
