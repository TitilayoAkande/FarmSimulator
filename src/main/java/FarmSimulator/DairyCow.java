package FarmSimulator;

public class DairyCow
{
    private int ID;
    private String owner;
    private String name;
    private int udder;
    private double capacity;


    public DairyCow()
    {

    }

    public DairyCow(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public double getCapacity()
    {
        return capacity;
    }


    @Override
    public String toString()
    {
        return "DairyCow{" +
                "ID=" + ID +
                ", owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", udder=" + udder +
                ", capacity=" + capacity +
                '}';
    }
}
