package FarmSimulator;

public class Animal
{
   private BeefCow beefCow;
   private Goat goat;
   private Sheep sheep;
   private String name;
   private int pedegree;
   private int age;
   private int weight;
   private Farm capacity;
   private int milkable;

    public Animal(BeefCow beefCow, Goat goat, Sheep sheep,
                  String name, int pedegree, int age,
                  int weight, Farm capacity, int milkable)
    {
        this.beefCow = beefCow;
        this.goat = goat;
        this.sheep = sheep;
        this.name = name;
        this.pedegree = pedegree;
        this.age = age;
        this.weight = weight;
        this.capacity = capacity;
        this.milkable = milkable;
    }

    public Animal()
    {


    }

    public void liveHour()
    {
        age++;
        weight++;
    }

    public void loadFromFile()
    {
    }
}
