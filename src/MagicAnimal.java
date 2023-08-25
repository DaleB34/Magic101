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

    //Getters

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getElement() {
        return element;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    //Setters
    public void setSpeed(int n)
    {
        speed = n;
    }

    public void setWeight(int n)
    {
        //not sure if this will be fully used
        weight = n;
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
