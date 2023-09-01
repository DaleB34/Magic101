public class Griffin extends MagicAnimal
{
    private int wings;
    private int talonShrp;

    public Griffin(String name, String type, String element, int speed, double health, int wings, int talonShrp)
    {
        super(name, type, element, speed, health);
        this.wings = wings;
        this.talonShrp = talonShrp;
        gCount++;
    }

    public Griffin(String name)
    {
        super(name);
        type = "Unknown";
        element = "Normal";
        speed = 0;
        health = 0.0;
        wings = 0;
        talonShrp = 0;
        gCount++;
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

    //getters
    public int getWings() {
        return wings;
    }

    public int getTalonShrp() {
        return talonShrp;
    }

    //setters
    @Override
    public void setRandom()
    {
        setWings((int) ((Math.random() * 10) + wings));
        setTalonShrp((int) ((Math.random() * 10) + talonShrp));
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void setTalonShrp(int talonShrp) {
        this.talonShrp = talonShrp;
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
