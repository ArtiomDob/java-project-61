/*package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String getUserName(Scanner scanner) {
        System.out.print("May I have your name? ");
        return scanner.nextLine();
    }
}  */

package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static final int ROUNDS_COUNT = 3;
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void runGame(String gameName, Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");

        {
            boolean correct = false;
            switch (gameName) {
                case "even":
                    hexlet.code.games.Even.start(scanner, name);
                    break;
                case "calc":
                    hexlet.code.games.Calculator.start(scanner, name);
                    break;
                 case "gcd":
                    hexlet.code.games.GCD.start(scanner, name);
                   break;

                default:
                    System.out.println("Unknown game");
                    return;
            }
            if (!correct) {
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}

