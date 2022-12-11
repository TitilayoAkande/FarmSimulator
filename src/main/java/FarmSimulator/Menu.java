package FarmSimulator;

public class Menu
{

    public static void main(String[] args)
    {

        Farm farm = new Farm();
        farm.run();

        START:
        while (true)
        {
            System.out.println("1. Add Animal");
            System.out.println("2. Remove Animal");
            System.out.println("3. List Animals");
            System.out.println("4. Save Animals");
            System.out.println("5. Load Animals");
            System.out.println("6. Print Farm Details");
            System.out.println("7. Exit");
            System.out.println("Please enter your choice: ");

            int choice = farm.getScanner().nextInt();

            switch (choice)
            {
                case 1:
                    farm.addAnimal();
                    break;
                case 2:
                    farm.removeAnimal();
                    break;
                case 3:
                    farm.listAnimals();
                    break;
                case 4:
                    farm.saveAnimals();
                    break;
                case 5:
                    farm.loadAnimals();
                    break;
                case 6:
                    farm.printFarmDetails();
                    break;
                case 7:
                    break START;
                default:
                    System.out.println("Invalid choice");
            }
        }

        ADD_FARMS:
        while (true)
        {
            System.out.println("1. Add Farm");
            System.out.println("2. Remove Farm");
            System.out.println("3. List Farms");
            System.out.println("4. Save Farms");
            System.out.println("5. Load Farms");
            System.out.println("6. Print Farm Details");
            System.out.println("7. Exit");
            System.out.println("Please enter your choice: ");

            int choice = farm.getScanner().nextInt();

            switch (choice)
            {
                case 1:
                    farm.addFarm();
                    break;
                case 2:
                    farm.removeFarm();
                    break;
                case 3:
                    farm.listFarms();
                    break;
                case 4:
                    farm.saveFarms();
                    break;
                case 5:
                    farm.loadFarms();
                    break;
                case 6:
                    farm.printFarmDetails();
                    break;
                case 7:
                    break ADD_FARMS;
                default:
                    System.out.println("Invalid choice");
            }
        }

       ADD_ANIMALS:
    while (true) {
        System.out.println("1. Add Animal");
        System.out.println("2. Remove Animal");
        System.out.println("3. List Animals");
        System.out.println("4. Save Animals");
        System.out.println("5. Load Animals");
        System.out.println("6. Print Farm Details");
        System.out.println("7. Exit");
        System.out.println("Please enter your choice: ");

        int choice = farm.getScanner().nextInt();

        switch (choice) {
            case 1:
                farm.addAnimal();
                break;
            case 2:
                farm.removeAnimal();
                break;
            case 3:
                farm.listAnimals();
                break;
            case 4:
                farm.saveAnimals();
                break;
            case 5:
                farm.loadAnimals();
                break;
            case 6:
                farm.printFarmDetails();
                break;
            case 7:
                break ADD_ANIMALS;
            default:
                System.out.println("Invalid choice");
        }
    }

                //Edit, the detail of any animal
                EDIT_ANIMALS:
                while (true)
                {
                    System.out.println("1. Edit Animal");
                    System.out.println("2. Delete Animal");
                    System.out.println("3. Print Animal Details");
                    System.out.println("4. Exit");
                    System.out.println("Please enter your choice: ");

                    int choice = farm.getScanner().nextInt();

                    switch (choice)
                    {
                        case 1:
                            farm.editAnimal();
                            break;
                        case 2:
                            farm.deleteAnimal();
                            break;
                        case 3:
                            farm.printAnimalDetails();
                            break;
                        case 4:
                            break EDIT_ANIMALS;
                        default:
                            System.out.println("Invalid choice");
                    }
                }

                //Delete the detail of any farm
                DELETE_FARMS:
                while (true)
                {
                    System.out.println("1. Delete Farm");
                    System.out.println("2. Print Farm Details");
                    System.out.println("3. Exit");
                    System.out.println("Please enter your choice: ");

                    int choice = farm.getScanner().nextInt();

                    switch (choice)
                    {
                        case 1:
                            farm.deleteFarm();
                            break;
                        case 2:
                            farm.printFarmDetails();
                            break;
                        case 3:
                            break DELETE_FARMS;
                        default:
                            System.out.println("Invalid choice");
                    }
                }

                //Print the detail of any animal
                PRINT_ANIMALS:
                while (true)
                {
                    System.out.println("1. Print Animal Details");
                    System.out.println("2. Exit");
                    System.out.println("Please enter your choice: ");

                    int choice = farm.getScanner().nextInt();

                    switch (choice)
                    {
                        case 1:
                            farm.printAnimalDetails();
                            break;
                        case 2:
                            break PRINT_ANIMALS;
                        default:
                            System.out.println("Invalid choice");
                    }
                }

        ADD_SHED:
        {
            System.out.println("Do you want to add a shed? ");
            String answer = farm.getScanner().nextLine();
            if (answer.equalsIgnoreCase("Yes"))
            {
                farm.addShed();
            }
            else if (answer.equalsIgnoreCase("No"))
            {
                System.out.println("You have chosen not to add a shed.");
            }
            else
            {
                System.out.println("Invalid input. Please try again.");
                break ADD_SHED;
            }
            {
                System.out.println("No shed added.");
            }



        }
        //Edit detail of any shed
        EDIT_SHED:
        while (true)
        {
            System.out.println("1. Edit Shed");
            System.out.println("2. Delete Shed");
            System.out.println("3. Print Shed Details");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice: ");

            int choice = farm.getScanner().nextInt();

            switch (choice)
            {
                case 1:
                    farm.editShed();
                    break;
                case 2:
                    farm.deleteShed();
                    break;
                case 3:
                    farm.printShedDetails();
                    break;
                case 4:
                    break EDIT_SHED;
                default:
                    System.out.println("Invalid choice");
            }

        }

        //Delete the detail of any shed
        DELETE_SHED:
        while (true)
        {
            System.out.println("1. Delete Shed");
            System.out.println("2. Print Shed Details");
            System.out.println("3. Exit");
            System.out.println("Please enter your choice: ");

            int choice = farm.getScanner().nextInt();

            switch (choice)
            {
                case 1:
                    farm.deleteShed();
                    break;
                case 2:
                    farm.printShedDetails();
                    break;
                case 3:
                    break DELETE_SHED;
                default:
                    System.out.println("Invalid choice");
            }
        }

        //Print the detail of any shed
        PRINT_SHED:
        while (true)
        {
            System.out.println("1. Print Shed Details");
            System.out.println("2. Exit");
            System.out.println("Please enter your choice: ");

            int choice = farm.getScanner().nextInt();

            switch (choice)
            {
                case 1:
                    farm.printShedDetails();
                    break;
                case 2:
                    break PRINT_SHED;
                default:
                    System.out.println("Invalid choice");
            }
        }

        //Print the details of the farm including its sheds, their milk tanks and herds
        PRINT_FARM:
        while (true)
        {
            System.out.println("1. Print Farm Details");
            System.out.println("2. Exit");
            System.out.println("Please enter your choice: ");

            int choice = farm.getScanner().nextInt();

            switch (choice)
            {
                case 1:
                    farm.printFarmDetails();
                    break;
                case 2:
                    break PRINT_FARM;
                default:
                    System.out.println("Invalid choice");
            }
        }


    }
}
