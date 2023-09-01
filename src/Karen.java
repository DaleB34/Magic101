import java.util.Scanner;
import java.util.Random;
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




    }//end of start()


    public void race(MagicAnimal a1, MagicAnimal a2)
    {
        //Animals attack each other one time at the very start, if either animal's health drops below 0, the last animal standing wins
        //otherwise, whichever animal is faster wins

        if(a1.getSpeed() > a2.getSpeed()) //if a1 is faster, they get to attack first
        {
            System.out.println(a1.getName() + " and " + a2.getName() + " begin the race but have a quick brawl at the beginning!");
            System.out.println(a1.getName() + " does " + a1.attack() + " damage to " + a2.getName()  + ", leaving them at " + (a2.getHealth() - a1.attack()) + " health" );

            if(a2.getHealth() < 0)//a1 wins from elimination
            {
                System.out.println("With that attack, " + a2.getName() + " is left behind at the starting line, allowing " + a1.getName() + " to win the race!!!!");
            }
            else //a2 has not lost all its health yet and wins by elimination
            {
                System.out.println(a2.getName() + " does " + a2.attack() + " damage to " + a1.getName()  + ", leaving them at " + (a1.getHealth() - a2.attack()) + " health" );
                if(a1.getHealth() < 0) //a2 wins from elimination
                {
                    System.out.println("With that attack, " + a1.getName() + " is left behind at the starting line, allowing " + a2.getName() + " to win the race!!!!");
                }
                else //ends here with a1 winning because starting if statement determines who is faster already
                {
                    System.out.println("Both racers leave the fight wounded, but " + a1.getName() + " comes out on top!!");
                }
            }
        }// end a1 faster

        else //a2 is faster
        {
            System.out.println(a2.getName() + " and " + a1.getName() + " begin the race but have a quick brawl at the beginning!");
            System.out.println(a2.getName() + " does " + a2.attack() + " damage to " + a1.getName()  + ", leaving them at " + (a1.getHealth() - a2.attack()) + " health" );

            if(a1.getHealth() < 0) //a2 wins from elimination
            {
                System.out.println("With that attack, " + a1.getName() + " is left behind at the starting line, allowing " + a2.getName() + " to win the race!!!!");
            }
            else //a1 has not lost all its health yet and wins by elimination
            {
                System.out.println(a1.getName() + " does " + a1.attack() + " damage to " + a2.getName()  + ", leaving them at " + (a2.getHealth() - a1.attack()) + " health" );
                if(a2.getHealth() < 0)//a1 wins from elimination
                {
                    System.out.println("With that attack, " + a2.getName() + " is left behind at the starting line, allowing " + a1.getName() + " to win the race!!!!");
                }
                else //ends here with a2 winning because starting if statement determines who is faster already
                {
                    System.out.println("Both racers leave the fight wounded, but " + a1.getName() + " comes out on top!!");
                }
            }
        }//end a2 faster




    }//end race



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
