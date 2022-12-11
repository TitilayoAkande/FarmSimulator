package FarmSimulator;

public class BeefCow extends Animal
{
    public BeefCow(BeefCow beefCow, Goat goat, Sheep sheep,
                   String name, int pedegree, int age,
                   int weight, Farm capacity, int milkable)
    {
        super(beefCow, goat, sheep, name, pedegree, age,
                weight, capacity, milkable);
    }

    private String name;
    private int pedegree;
    private int age;
    private int weight;
    private Farm capacity;
    private int milkable = 0;


    public void saveToFile()
    {
    }
}



