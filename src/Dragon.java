public class Dragon extends MagicAnimal
{
    private int wings;
    private int breathPwr; //how strong their breath is
    public Dragon(String name, String type, String element, int speed, double health, int wings, int breathPwr)
    {
        super(name, type, element, speed, health);
        this.wings = wings;
        this.breathPwr = breathPwr;
    }

    //Brain Methods

    @Override
    public double attack()
    {
        return breatheFire() + wingSlap();
    }

    public double breatheFire()
    {
        return breathPwr * (health/2);
    }

    public double wingSlap()
    {
        return (wings * 0.1) * health;
    }

    //Setters

    @Override
    public void setInfo()
    {
        setWings((int) ((Math.random() * 10) + wings));
        setBreathPwr(0);
    }

    public void setWings(int w)
    {
        wings = w;
    }

    public void setBreathPwr(int b)
    {
        breathPwr = b;
    }


    //Getters

    public int getWings()
    {
        return wings;
    }

    public int getBreathPwr()
    {
        return breathPwr;
    }


    //toString
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Number of Wings: " + wings + "\n"
                + "Strength of Scales: " + breathPwr;
    }
}
