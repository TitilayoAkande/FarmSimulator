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

    public Shed getMilkTank ()
    {

        return null;
    }

    public void installMilkingMachine(MilkingMachine milkingMachine)
    {

    }

    public void milkAnimal(Animal animal)
    {

    }

    public void milkAnimal(Collection<Animal> animals)
    {

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
}
