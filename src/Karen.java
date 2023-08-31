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
}
