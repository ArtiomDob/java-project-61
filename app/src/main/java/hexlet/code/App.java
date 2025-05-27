package hexlet.code;

import java.util.Scanner;

//import hexlet.code.games.Even;
//import hexlet.code.games.Calculator;
import hexlet.code.games.Greet;
import hexlet.code.Engine;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
       // System.out.println("4 - GCD");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

         switch (choice) {
            case 1:
               Greet.start(scanner);
               break;
            case 2:
                Engine.runGame("even", scanner);
               break;
            case 3:

               // String name = scanner.nextLine().trim();
                Engine.runGame("calc", scanner);
                break;
           // case 4:
               // GCD.start(scanner);
              //  break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

/*public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                greetUser(scanner);
                break;
            case 2:
                Even.start(scanner);
                break;
            case 0:
                System.out.println("Exiting the game. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
        scanner.close();
    }

    private static void greetUser(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
    /* public static void main(String[] args) {

     //  System.out.println("Welcome to the Brain Games!");
        Cli cli = new Cli();
        cli.welcome();
    }
} */
