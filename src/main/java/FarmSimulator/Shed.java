package FarmSimulator;

import java.util.Collection;

public class Shed extends MilkTank

{
    private int Id;
    private int oneRoomForMilking;
    private MilkTank milkTank;
    private MilkingMachine milkingMachine;

    public Shed(MilkTank tank)
    {
        this.milkTank = tank;
    }

    //returns the shed’s milk
    public void getMilk()
    {
        milkTank.getMilk();
    }


    public void installMilkingMachine(MilkingMachine milkingMachine)
    {
        this.milkingMachine = milkingMachine;

    }

    //returns the connected milking machine or null if the machine isn’t installed
    public MilkingMachine getMilkingMachine()
    {
        return milkingMachine;
    }

    public void milkAnimal(Animal animal)
    {
        milkingMachine.milk((IMilkable) animal);
    }

    public void milkAllAnimals(Collection<Animal> animals)
    {
        for (Animal animal : animals)
        {
            milkingMachine.milk((IMilkable) animal);
        }
    }
    public void milkAnimal(Collection<Animal> animals)
    {
        if (milkingMachine == null)
        {
            throw new IllegalStateException("Milking machine is not installed");
        }
        else
        {
            for (Animal animal : animals)
            {
                milkingMachine.milk((IMilkable) animal);
            }

        }
    }


    @Override
    public String toString()
    {
        return "Shed{" +
                "Id=" + Id +
                ", oneRoomForMilking=" + oneRoomForMilking +
                ", milkTank=" + milkTank +
                ", milkingMachine=" + milkingMachine +
                '}';
    }

    public void loadFromFile()
    {
    }

    public void saveToFile()
    {
    }
}
