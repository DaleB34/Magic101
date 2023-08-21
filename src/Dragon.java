public class Dragon extends MagicAnimal
{
    private int wings;
    private int scalePwr; //how hard the scales are (defense)
    public Dragon(String name, String type, String element, int speed, int weight, int wings, int scalePwr)
    {
        super(name, type, element, speed, weight);
        this.wings = wings;
        this.scalePwr = scalePwr;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Number of Wings: " + wings + "\n"
                + "Strength of Scales: " + scalePwr;
    }
}
