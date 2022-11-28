package FarmSimulator;

import java.util.ArrayList;

public class MilkTank
{
    private double customCapacity;
    private double capacity;

    public MilkTank()
    {

    }

    public MilkTank(int customCapacity)
    {

    }

    public double getCapacity()
    {
        return capacity;
    }

    public double freeSpace()
    {

        return 0;
    }

    public void  addToTank(double amount)
    {

    }

    public double getFromTank(double amount)
    {

        return amount;
    }

    @Override
    public String toString()
    {
        return "MilkTank{" +
                "customCapacity=" + customCapacity +
                ", capacity=" + capacity +
                '}';
    }
}
