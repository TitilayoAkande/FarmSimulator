package FarmSimulator;

public class DairyCow extends Animal
{
    private int ID;
    private String owner;
    private String name;
    private final int udders = 4;
    private int udderCapacity = 20 - 40;
    private int milkProduced = 4-5;


    //creates a new cow with a random name
    public DairyCow(String owner)
    {
        this.owner = owner;
        name = "Cow" + (int)(Math.random() * 1000);
    }

    //creates a new cow with a given name
    public DairyCow(String owner, String name)
    {
        this.owner = owner;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    //returns the udder capacity of the DairyCow
    double getUdderCapacity()
    {
        return udderCapacity;
    }


    //returns a string that describes a cow
    public String toString()
    {
        return "DairyCow " + name + " owned by " + owner;
    }




}
