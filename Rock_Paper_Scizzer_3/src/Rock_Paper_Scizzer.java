import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scizzer {
    private static int user = 0;
    private static int comp = 0;
    private int compChoice;
    private int userInput;

    static {
        System.out.println("####----Enter 1 for Rock----####");
        System.out.println("####----Enter 2 for Paper----####");
        System.out.println("####----Enter 3 for Scizzer----####");
    }

    //This Method will generate the random number as comp input
    public void randomNumberGenerator() {
        Random ra = new Random();
        compChoice = ra.nextInt(1, 4);
        System.out.println(compChoice);
        if (compChoice == 1) {
            System.out.println("Computer choose Rock");
        } else if (compChoice == 2) {
            System.out.println("Computer choose Paper");
        } else {
            System.out.println("Computer choose Scizzer");
        }
    }

    //This Method will take input from user
    public void useInputValue() {
        System.out.println("Please Enter Your Choice...");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();

        //System.out.println(userInput);

        if (userInput == 1) {
            System.out.println("User choose Rock");
        } else if (userInput == 2) {
            System.out.println("User choose Paper");
        } else {
            System.out.println("User choose Scizzer");
        }

    }

    //Depending upon User & Comp input it will print their choice as well as update their score
    public void resultGenerator() {
        if (userInput == compChoice) {
            System.out.println("Its a Tie");
        } else if (userInput == 1 && compChoice == 2) {
            System.out.println("Computer Won....");
            comp++;
        } else if (userInput == 2 && compChoice == 3) {
            System.out.println("Computer Won....");
            comp++;
        } else if (userInput == 3 && compChoice == 1) {
            System.out.println("Computer Won....");
            comp++;
        } else if (userInput == 2 && compChoice == 1) {
            System.out.println("You Won....");
            user++;
        } else if (userInput == 3 && compChoice == 2) {
            System.out.println("You Won....");
            user++;
        } else if (userInput == 1 && compChoice == 3) {
            System.out.println("You Won....");
            user++;
        }
    }

    //This Method will display final score
    public void result() {
        System.out.println("Computer Score is : " + comp);
        System.out.println("Your Score is : " + user);
    }

    //This Method asks how may rounds of game you want to play
    // we are calling this method in Main and inside these method rest of method called

    public void roundsToPlay() {
        System.out.println("Please Enter How many rounds you want to play.....");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        for (int i = 1; i <= j; i++) {
            System.out.println("###########################################################");
            useInputValue();
            randomNumberGenerator();
            resultGenerator();
            result();
            System.out.println("###########################################################");

        }
    }
}
