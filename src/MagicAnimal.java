public class MagicAnimal {
    public String name;
    public String type;
    public String element;
    public int speed; // in mmph (magical miles per hour)
    public int weight; //in lbs

    public MagicAnimal(String name, String type, String element, int speed, int weight)
    {
        this.name = name;
        this.type = type;
        this.element = element;
        this.speed = speed;
        this.weight = weight;
    }

    public MagicAnimal(String name) {
        this.name = name;
        type = "Unknown";
        element = "Normal";
        speed = 10;
        weight = 10;
    }


    //Brain Methods


    //toString


    @Override
    public String toString() {
        return  "Name: " + name + " The " + type + "\n" +
                "Element: " + element + "\n" +
                "Speed: " + speed + "mmph\n" +
                "Weight: " + weight + "lbs";
    }
}
