
package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // меню выбора игры
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
                Engine.runGame("even");
                break;
            case 3:
                Engine.runGame("calc");
                break;
            case 4:
                Engine.runGame("gcd");
                break;
            case 5:
                Engine.runGame("pro");
                break;
            case 6:
                Engine.runGame("prime");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
