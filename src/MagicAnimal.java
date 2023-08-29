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
    public void feed(int pieces)
    {
        //feed the animal a piece of steak seasoned with enhancing substances via magic
        //will have validation to make sure value isn't less than 0
        //also have validation to make sure they don't make animal explode with 1000 pieces of food
        if (pieces <= 5)
        {
            //I HATE DOUBLE MULTIPLICATION!!!!
            setSpeed( (int) (getSpeed() * 0.07));
        }
        else if (pieces <= 20)
        {
            //increase speed by a tenth of how many pieces have been fed
            setSpeed( (int) (getSpeed() * (0.03 * pieces)));
        }
        else //pieces fed greater than 20
        {
            //decrease speed by half a percent of the amount of pieces fed
            setSpeed( (int) (getSpeed() * (1- (0.005 * pieces))));
        }
    }

    public Double attack()
    {
        //returns amount of damage done from animal's attacks
        return punch();
    }

    public Double punch()
    {
        //multiplying by 1.11 because it takes 200 pounds of force to knock out someone
        //and the average body weight is 180 pounds, so 200/180 = 1.11
        return weight * 1.1;
    }


    //toString

    @Override
    public String toString() {
        return  "Name: " + name + " The " + type + "\n" +
                "Element: " + element + "\n" +
                "Speed: " + speed + "mmph\n" +
                "Weight: " + weight + "lbs";
    }
}
