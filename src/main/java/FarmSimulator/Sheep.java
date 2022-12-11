package FarmSimulator;

public class Sheep extends Animal

{
    private String name;
    private int pedegree;
    private int age;
    private int weight;
    private int capacity;
    private int milkable = 0;

    public Sheep(BeefCow beefCow, Goat goat, Sheep sheep,
                 String name, int pedegree, int age,
                 int weight, Farm capacity, int milkable)
    {
        super(beefCow, goat, sheep, name, pedegree, age,
                weight, capacity, milkable);
    }

    public void saveToFile()
    {
    }
}
