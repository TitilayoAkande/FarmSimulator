package FarmSimulator;

public class DairyCow extends Animal
{
    private int ID;
    private String owner;
    private String name;
    private final int udders = 4;

    //udder capacity between 20 and 40
    private int udderCapacity = (int)(Math.random() * 20) + 20;

    private int milkProduced = 4-5;


    //creates a new cow with a random name
    public DairyCow()
    {
        super();

        this.name = "Dairy Cow";
    }

    //creates a new cow with a given name
    public DairyCow( String name)
    {
        this();
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


    public void saveToFile()
    {
    }
}
