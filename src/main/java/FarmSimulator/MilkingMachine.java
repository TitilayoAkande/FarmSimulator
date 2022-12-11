package FarmSimulator;

public class MilkingMachine extends MilkTank
{



    public MilkingMachine()
    {

    }
    //returns the connected milk tank or null if the tank isn’t installed
    public MilkTank getMilkTank()
    {
        MilkTank milkTank = null;
        return milkTank;
    }

    //connects the milking machine to the given milk tank
    public void installMilkingMachine(MilkTank milkTank)
    {
        this.milkTank = milkTank;
    }

    //installs the milk tank
    void setMilkTank(MilkTank milkTank)
    {
        this.milkTank = milkTank;
    }

    //milk the cow and fill the connected milk tank
     void milk(IMilkable milkable)
    {
        if (milkable == null)
        {
            throw new IllegalArgumentException("Animal is null");
        }
        else
        {
            milkable.milk();
        }
    }






}
