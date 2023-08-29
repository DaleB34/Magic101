public class Dragon extends MagicAnimal
{
    private int wings;
    private int breathPwr; //how strong their breath is
    public Dragon(String name, String type, String element, int speed, Double health, int wings, int breathPwr)
    {
        super(name, type, element, speed, health);
        this.wings = wings;
        this.breathPwr = breathPwr;
    }

    //Brain Methods
    public void breatheFire(MagicAnimal a)
    {

    }


    //toString
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Number of Wings: " + wings + "\n"
                + "Strength of Scales: " + breathPwr;
    }
}
