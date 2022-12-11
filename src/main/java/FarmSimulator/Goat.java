package FarmSimulator;

public class Goat extends Animal
{

    private String name;
    private int pedegree;
    private int age;
    private int weight;
    private Farm capacity;
    private int milkProduced = (int)(Math.random() * 2) + 2;
    private int milkable = 0;



    public Goat(BeefCow beefCow, Goat goat, Sheep sheep,
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
