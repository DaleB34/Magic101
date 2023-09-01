public class Main {
    public static void main(String[] args)
    {
        //instantiate objects
        Dragon spyro = new Dragon("Spyro", "Dragon", "Fire", 1227, 4400.0, 2, 8);
        Dragon toothless = new Dragon("Toothless", "Dragon", "Dark", 60, 1776.0, 2, 10);

        Griffin peter = new Griffin("Peter", "Griffin", "Normal", 768, 2200.0, 10, 40);
        Griffin bob = new Griffin("Bob", "Griffin", "Normal", 72, 5000.0, 2, 20);

        Unicorn tspark = new Unicorn("Twilight Sparkle", "Unicorn", "Fairy", 300, 1810.0, 10, 1000);
        Unicorn bstall = new Unicorn("Butt Stallion", "Binicorn", "Fairy", 100, 7800.0, 20, 10);


        Karen karen = new Karen("Karen", 6);
        karen.addRacer(spyro);
        karen.addRacer(toothless);
        karen.addRacer(peter);
        karen.addRacer(bob);
        karen.addRacer(tspark);
        karen.addRacer(bstall);

        karen.start();


    }
}