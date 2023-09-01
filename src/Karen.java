import java.util.Scanner;
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

    //brain methods

    public void start()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here are all the racers you can choose from: " + toString());

        //select 1st animal
        System.out.println("Please enter the first number of the animal you want to race: ");
        int a1 = sc.nextInt();
        while(a1 < 1 || a1 > racers.length)
        {
            System.out.println("Invalid Answer\nPlease enter the first number of the animal you want to race:");
            a1 = sc.nextInt();
        }



    }


    public void addRacer(MagicAnimal a)
    {
        racers[count] = a;
        count++;
    }


    //toString
    public String toString()
    {
        //print data of all racers
        String output = "";
        int i = 1;
        for(MagicAnimal a : racers)
        {
            output+= "\n" + i + ". " + a + "\n"; //formatting yayayayay
            i++;
        }
        return output;

    }
}
