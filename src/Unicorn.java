public class Unicorn extends MagicAnimal
{
    private int hornShrp;
    private int heartPurity;

    public Unicorn(String name, String type, String element, int speed, double health, int hornShrp, int heartPurity)
    {
        super(name, type, element, speed, health);
        this.hornShrp = hornShrp;
        this.heartPurity = heartPurity;
    }

    //brain methods

    public double stab()
    {
        return (hornShrp * 0.37) * health;
    }

    public double rBeam()
    {
        return (heartPurity * 0.21) * health;
    }

    @Override
    public double attack()
    {
        return rBeam() + stab();
    }

    //getters
    public int getHornShrp() {
        return hornShrp;
    }

    public int getHeartPurity() {
        return heartPurity;
    }

    //setters

    @Override
    public void setInfo()
    {
        setHornShrp((int) ((Math.random() * 10) + hornShrp));
        setHeartPurity((int) ((Math.random() * 10) + heartPurity));
    }

    public void setHornShrp(int hornShrp) {
        this.hornShrp = hornShrp;
    }

    public void setHeartPurity(int heartPurity) {
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
