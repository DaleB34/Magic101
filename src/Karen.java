public class Karen
{
    //mostly going off base structure of Farmer from Old MacDonald
    private String name;
    private MagicAnimal[] racers;
    private int count = 0;

    public Karen(String name, int numRacers)
    {
        this.name = name;
        racers = new MagicAnimal[numRacers];
    }

    public void addRacer(MagicAnimal a)
    {
        racers[count] = a;
        count++;
    }

    public String toString()
    {
        //print data of all racers
        String output = "";
        for(MagicAnimal a : racers)
        {
            output+= "\n" + a + "\n"; //formatting yayayayay
        }
        return output;

    }
}
