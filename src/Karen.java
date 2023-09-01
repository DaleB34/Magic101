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
        System.out.println("Please enter the number of the first animal you want to race: ");
        int a1 = sc.nextInt();

        //validation to make sure user does not select elements not in the range of the list
        while(a1 < 1 || a1 > racers.length)
        {
            System.out.println("Invalid Answer\nPlease enter the number of the first animal you want to race:");
            a1 = sc.nextInt();
        }


        //select 2nd animal
        System.out.println("Please enter the number of the second animal you want to race: ");
        int a2 = sc.nextInt();

        //validation to prevent animal from racing itself
        while (a2 < 1 || a2 > racers.length || a2 == a1)
        {
            System.out.println("Invalid Answer\nPlease enter the second number of the animal you want to race:");
            a2 = sc.nextInt();
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
