import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    private static Scanner sc = new Scanner(System.in);
    private static String name;
    private static String race;
    private static Integer age;
    private static Integer weight;
    private static String cmd;
    private static Boolean run = true;
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();

    public static void main(String[] args) {
        System.out.println("*************************************************");
        System.out.println("************WELCOME TO THE KENNEL****************");
        System.out.println("*****************COMMANDS************************");
        System.out.println("*************register new dog********************");
        System.out.println("****************increase age*********************");
        System.out.println("*****************list dogs***********************");
        System.out.println("****************remove dog***********************");
        System.out.println("*******************exit**************************");
        // write your code here
        while (run == true) {
            sc.nextLine();
            System.out.print("Command: ");
            cmd = sc.nextLine();
            executeCmd(cmd);
        }
    }
    private static void executeCmd(String Cmd) {
        if (Cmd.equals("register new dog")) {
            System.out.print("Name: ");
            name = sc.next();
            System.out.print("Race: ");
            race = sc.next();
            System.out.print("Age: ");
            age = sc.nextInt();
            System.out.print("Weight: ");
            weight = sc.nextInt();
            Dog dog = new Dog(name, race, age, weight);
            dogList.add(dog);
        }
        if (Cmd.equals("increase age")) {
            System.out.print("Name of dog: ");
            name = sc.next();
            increaseAge(name);
        }
        if (Cmd.equals("list dogs")) {
            System.out.print("TailLength: ");
            listDogs(sc.nextInt());
        }
        if (Cmd.equals("exit")) {
            run = false;
        }
        if (Cmd.equals("remove dog")) {
            System.out.print("Name: ");
            name = sc.next();
            removeDog(name);
        }
    }
    private static void exitProgram() {
        System.exit(0);
    }
    private static void listDogs(int tailLength) {
        for (Dog dogs : dogList) {
            if (dogs.GetTailLength() > tailLength) {
                System.out.println("Name: " + dogs.GetName() + " Race: " + dogs.GetRace() + " Age: " + dogs.GetAge() + " Weight: " + dogs.GetWeight() + " Taillength: " + dogs.GetTailLength());
            }
        }
    }
    private static void increaseAge(String Name) {
        if (!dogList.isEmpty()) {
            for (Dog dogs : dogList) {
                String dogName = dogs.GetName();
                if (dogName.equals(Name)) {
                    dogs.IncreaseAge();
                }
            }
        }
    }
    private static void removeDog(String Name){
        int i = -1;
        if (!dogList.isEmpty()) {
            for (Dog dogs : dogList) {

                String dogName = dogs.GetName();
                if (dogName.equals(Name)) {
                    i = dogList.indexOf(dogs);
                }
            }
        }
        if(i > -1)
        {
            dogList.remove(i);
        }
    }
}