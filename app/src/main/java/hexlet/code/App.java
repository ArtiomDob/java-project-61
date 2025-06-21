package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                Cli.start(scanner);
                break;
            case 2:
                Engine.runGame("even", scanner);
                break;
            case 3:
                Engine.runGame("calc", scanner);
                break;
            case 4:
                Engine.runGame("gcd", scanner);
                break;
            case 5:
                Engine.runGame("pro", scanner);
                break;
            case 6:
                Engine.runGame("prime", scanner);
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice.");
        }
    }
}