package FarmSimulator;

import java.util.ArrayList;
import java.util.Scanner;

public class Farm
{
    private int ID;
    private String owner;
    private Shed shed;
    private ArrayList<Animal> herd = new ArrayList<Animal>();


    public void run()
    {
        for (Animal animal : herd)
        {
            animal.liveHour();
        }
    }

    public Scanner getScanner()
    {
        return new Scanner(System.in);
    }

    public void addShed()
    {
        System.out.println("Enter the shed's ID: ");
        int shedID = getScanner().nextInt();
        System.out.println("Enter the shed's capacity: ");
        int shedCapacity = getScanner().nextInt();
        System.out.println("Enter the shed's milk capacity: ");
        int shedMilkCapacity = getScanner().nextInt();
        System.out.println("Enter the shed's milk amount: ");
        int shedMilkAmount = getScanner().nextInt();
        System.out.println("Enter the shed's milkable: ");
        int shedMilkable = getScanner().nextInt();
        System.out.println("Enter the shed's milkable capacity: ");
        int shedMilkableCapacity = getScanner().nextInt();
        System.out.println("Enter the shed's milkable amount: ");
        int shedMilkableAmount = getScanner().nextInt();
        System.out.println("Enter the shed's milkable type: ");
        String shedMilkableType = getScanner().nextLine();
        System.out.println("Enter the shed's milkable type capacity: ");
        int shedMilkableTypeCapacity = getScanner().nextInt();
        System.out.println("Enter the shed's milkable type amount: ");
        int shedMilkableTypeAmount = getScanner().nextInt();
        System.out.println("Enter the shed's milkable type milkable: ");
        int shedMilkableTypeMilkable = getScanner().nextInt();
        System.out.println("Enter the shed's milkable type milkable capacity: ");
        int shedMilkableTypeMilkableCapacity = getScanner().nextInt();
        System.out.println("Enter the shed's milkable type milkable amount: ");
        int shedMilkableTypeMilkableAmount = getScanner().nextInt();
        System.out.println("Enter the shed's milkable type milkable type: ");
        String shedMilkableTypeMilkableType = getScanner().nextLine();
        System.out.println("Enter the shed's milkable type milkable type capacity: ");
        int shedMilkableTypeMilkableTypeCapacity = getScanner().nextInt();
        System.out.println("Enter the shed's milkable type milkable type amount: ");
        int shedMilkableTypeMilkableTypeAmount = getScanner().nextInt();
        System.out.println("Enter the shed's milkable type milkable type milkable: ");
        int shedMilkableTypeMilkableTypeMilkable = getScanner().nextInt();
    }

    public void loadFromFile()
    {
        // TODO Auto-generated method stub

    }

    public void saveToFile()
    {
        // TODO Auto-generated method stub

    }

    public void editShed()
    {
        // TODO Auto-generated method stub

    }

    public void deleteShed()
    {
        // TODO Auto-generated method stub

    }

    public void printShed()
    {
        // TODO Auto-generated method stub

    }

    public void addAnimal()
    {
    }

    public void removeAnimal()
    {
    }

    public void listAnimals()
    {
    }

    public void saveAnimals()
    {
    }

    public void loadAnimals()
    {

    }

    public void printFarmDetails()
    {
    }

    public void addFarm()
    {
    }

    public void removeFarm()
    {
    }

    public void listFarms()
    {
    }

    public void saveFarms()
    {
    }

    public void loadFarms()
    {

    }

    public void editAnimal()
    {
    }

    public void deleteAnimal()
    {
    }

    public void printAnimalDetails()
    {
    }

    public void deleteFarm()
    {
    }

    public void printShedDetails()
    {
    }

    public void milkAllAnimals()
    {

    }

    public void death()
    {

    }
    public void milkCollection()
    {
        for (Animal animal : herd)
        {
            if (animal instanceof IMilkable)
            {
                ((IMilkable) animal).milk();
            }
        }
    }


    public void printOrder()
    {
        for (Animal animal : herd)
        {
            System.out.println(animal);
        }
    }

    public void load()
    {
        // TODO Auto-generated method stub
    }

    public void store()
    {
        // TODO Auto-generated method stub
    }
}
