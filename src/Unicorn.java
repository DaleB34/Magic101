public class Unicorn extends MagicAnimal
{
    private int hornShrp;
    private int heartPurity;

    public Unicorn(String name, String type, String element, int speed, Double weight, int hornShrp, int heartPurity)
    {
        super(name, type, element, speed, weight);
        this.hornShrp = hornShrp;
        this.heartPurity = heartPurity;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\n"
                + "Heart Purity: " + heartPurity + "\n"
                + "Horn Sharpness: " + hornShrp;
    }
}
