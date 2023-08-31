public class MagicAnimal {
    public String name;
    public String type;
    public String element;
    public int speed; // in mmph (magical miles per hour)
    public Double health; //in lbs

    public MagicAnimal(String name, String type, String element, int speed, double health)
    {
        this.name = name;
        this.type = type;
        this.element = element;
        this.speed = speed;
        this.health = health;
    }

    public MagicAnimal(String name) {
        this.name = name;
        type = "Unknown";
        element = "Normal";
        speed = 0;
        health = 0.0;
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

    public double getHealth() {
        return health;
    }

    //Setters
    public void setSpeed(int n)
    {
        speed = n;
    }

    public void setHealth(double n)
    {
        //not sure if this will be used
        health = n;
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

    public double attack()
    {
        //returns amount of damage done from animal's attacks
        return punch();
    }

    public double punch()
    {
        //multiplying by 1.11 because it takes 200 pounds of force to knock out someone
        //and the average body weight is 180 pounds, so 200/180 = 1.11
        return getHealth() * 1.1;
    }


    //toString

    @Override
    public String toString() {
        return  "Name: " + name + " The " + type + "\n" +
                "Element: " + element + "\n" +
                "Speed: " + speed + "mmph\n" +
                "Health Points: " + health + "hp";
    }
}
