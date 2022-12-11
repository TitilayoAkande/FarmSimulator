package FarmSimulator;
public class MilkTank
{
    private double customCapacity;
    private double capacity;
    private double maxCapacity = 2000;

    MilkTank milkTank;

    public MilkTank()
    {

    }

    public MilkTank getMilkTank()
    {
        return milkTank;
    }

    public MilkTank(int customCapacity)
    {
        this.customCapacity = customCapacity;
    }

    public double getCapacity()
    {
        return capacity;
    }

    //Gives it an amount, add it to the tank's capacity
    public double freeSpace()
    {
        return capacity - customCapacity;

    }


    //Create a method to add only as much as  milk as the tank can hold
    //If the tank is full, the method should return the amount of milk that was not added
    public double addToTank(double amount)
    {
        if (amount > freeSpace())
        {
            double amountNotAdded = amount - freeSpace();
            capacity = maxCapacity;
            return amountNotAdded;
        }
        else
        {
            capacity += amount;
            return 0;
        }
    }

    //tankers come to collect the milk from the tank
    public double takeFromTank(double amount)
    {
        if (amount > capacity)
        {
            double amountNotTaken = amount - capacity;
            capacity = 0;
            return amountNotTaken;
        }
        else
        {
            capacity -= amount;
            return 0;
        }
    }

    @Override
    public String toString()
    {
        return "MilkTank{" +
                "customCapacity=" + customCapacity +
                ", capacity=" + capacity +
                ", maxCapacity=" + maxCapacity +
                '}';
    }


    protected void getMilk()
    {
    }
}
