import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Exercise 1:
    //             In 250 words or less: In your own words - describe the concept and mechanisms used in inheritance
    static void printExerciseOneAnswer(){

        System.out.println("==================================================================================================================================================================");
        System.out.println(
            "Inheritance is a concept in Object oriented programming that describes the mechanism where a class can inherent other classes attributes as well as methods and constructors.\n" +
            "This will help a program to not repeat a lot of shared code between two classes.\n" +
            "An example is a “generic” cup class (super class) and a number of different “variation” cup classes (sub classes) that inherits from the cup class.\n" +
            "The generic cup can for instance have a size and a method fill up, because that is something all cups can do.\n" +
            "If a sub class have a variation of a method from the super class the method can be overwritten with the keyword @Override. \n" +
            "To make a class a sub class the keyword “extends” are used after the class name, followed by the super class name. \n"
        );
        System.out.println("==================================================================================================================================================================");
    }

//=================================================================================================================================================================
    // Exercise 2: Program that exemplifies the concept of inheritance.
    //             Cup class = super/parent class
    //             WifiHeatCup & Bluetooth class = sub/child classes
    static void createCups(){
        System.out.println("WIFI CUP <=====================================");
        WifiHeatCup wifiHeatCup = new WifiHeatCup();
        wifiHeatCup.setMadeBy("GETACUP");
        wifiHeatCup.setMaterial("Ceramic");
        wifiHeatCup.setVolume(250);
        wifiHeatCup.setHasHandel(true);
        wifiHeatCup.fillUp(200, "Coffee");
        wifiHeatCup.setWifiOn(true);
        wifiHeatCup.warmCupUp(80);
        System.out.println(wifiHeatCup.toString());
        System.out.println();

        System.out.println("BLUETOOTH CUP <================================");
        BluetoothCup bluetoothCup = new BluetoothCup();
        bluetoothCup.setMadeBy("GAMERCUP");
        bluetoothCup.setMaterial("Plastic");
        bluetoothCup.setVolume(300);
        bluetoothCup.setHasHandel(false);
        bluetoothCup.fillUp(350, "Green tea");
        bluetoothCup.setBluetoothOn(true);
        bluetoothCup.setLEDColor("Green");
        bluetoothCup.LEDSwitch();
        System.out.println(bluetoothCup.toString());
        System.out.println();
    }

//=================================================================================================================================================================
    // Exercise 3: Program that reads a file with n number of strings separated by linebreaks.
    //             The program prints how many words are in the file
    static void readFile(){

        ReadFile strings = new ReadFile("resources/Strings.csv");
        strings.printFileContent();
        System.out.println("Number of words in file: " + strings.getLineCount());
    }

//=================================================================================================================================================================
    // Exercise 4: Program that calculates how the US population are projected to be in 5 years.
    //             Print the growth & sum
    static void growthUS(int years){

        double growth = 1.0 / 7.0; // per seconds
        double death = 1.0 / 13.0; // per seconds
        double growthRate =  growth - death; // per second
        double currentPopulation = 331002651; //331,002,651 million


        double yearConversion = 60 * 60 * 24 * 365.24;
        double ratePerYear = yearConversion * growthRate;
        double futurePopulation = ratePerYear * years + currentPopulation;


        System.out.printf("Initial Population:\n%.0f\n", currentPopulation);
        System.out.printf("Rate of growth per year:\n%.2f\n" , ratePerYear);
        System.out.println("# Years:\n" + years);
        System.out.printf("Future population:\n%.0f", futurePopulation);

    }

//=================================================================================================================================================================
    // Exercise 5: In your own words - explain the following program in 250 words or less.
    static void printExerciseFiveAnswer(){

        System.out.println("========================================================================================");
        System.out.println(
                "In the main method a “For Loop”, that runs 10 iterations are in each iteration calling\n" +
                "a method that returns an integer value and stores it in a variable called random,\n" +
                "and the variable gets then printed to the console on a new line.\n" +
                "The method that is being called returns an int and takes no parameters.\n" +
                "Inside the method the Random class is being imported and a new Random object is created. \n" +
                "It returns a random number from 0 - 9 since the bound is set to 10.\n" +
                "\n" +
                "It returns 10 random generated integers from 0-9, each number integer on a new line. \n" +
                "The last line is a text saying Random integers generated.\n"
        );
        System.out.println("========================================================================================");
    }

//=================================================================================================================================================================
    // Exercise 6: A Program that constructs an arraylist containing the numbers 1 to 100, and prints them out.
    //             The program ask the user for a number and remove all multiples of that number (except for the number itself) from the list.
    static void userInteraction() {
        Scanner scan = new Scanner(System.in);

        System.out.println("The program will remove all multiples of a number except the number itself");
        System.out.println("Please input that number interger to remove all multiples from the list:");
        while (true) {
            try {
                int factor = scan.nextInt();
                ArrayList<Integer> newList = removeMultipuls(getNumbers(100), factor);
                System.out.println("New List: (ListSize = " + newList.size() + ")");
                System.out.println(newList);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input\nTry a number");
            }
            scan.next();
        }

    }

    static ArrayList<Integer> getNumbers(int size){
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            numbers.add(i);
        }
        System.out.println("Original List: (ListSize = " + numbers.size() + ")");
        System.out.println(numbers);
        return numbers;
    }

    static ArrayList<Integer> removeMultipuls(ArrayList<Integer> numbers, int factor){

        ArrayList<Integer> removedNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == factor){
                continue;
            }
            else if (numbers.get(i) % factor == 0){
                removedNumbers.add(numbers.get(i));
                numbers.remove(i);
                i --;
            }
        }
        System.out.println("Removed numbers: (ListSize = " + removedNumbers.size() + ")");
        System.out.println(removedNumbers);
        return numbers;
    }

//=================================================================================================================================================================
    // Exercise 7: In 250 words or fewer: explain the concept of the "static" keyword. You can use a code example.
    static void printExerciseSevenAnswer(){

        System.out.println("==================================================================================================================================================================");
        System.out.println(
                "The keyword ’static’ is a ‘non-access modifier’ unlike ‘access-modifiers’ like ‘public’ or ‘private’.\n" +
                        "When written at the start of a variable or a method, it makes the variable or method\n" +
                        "able to be accessed without creating an object of a class. \n" +
                        "In other words its part of the class, rather than part of an object of the class.\n" +
                        "\n" +
                        "A use case could be a “static int counter” that keeps track of the number of times a new object of a class have been created.\n" +
                        "The counter increments every time the classes constructor are called.\n"
        );
        System.out.println("==================================================================================================================================================================");
    }

//=================================================================================================================================================================


    public static void main(String[] args) {

        //printExerciseOneAnswer();
        //createCups();
        //readFile();
        //growthUS(5);
        //printExerciseFiveAnswer();
        //userInteraction();
        //printExerciseSevenAnswer();

    }
}
