package Temp;

public class Chicken {
    // constructor inside my class
    public Chicken ()
    {
        System.out.println("This is executed when class is instantiated");
    }
    public Chicken(String chickenRace)
    {
        System.out.println(chickenRace);
    }
    static
    {
        System.out.println("This is executed only when the class is first loaded");
    }
    public void sound()
    {
        System.out.println("cook-a-dole");
    }
    public void eat()
    {
        System.out.println("tuka");
    }
    public static void walk()
    {
        System.out.println("walk pina kembot");
    }
}
