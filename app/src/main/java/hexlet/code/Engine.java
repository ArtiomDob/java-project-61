package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void runGame(String gameName, Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");


        for (int i = 0; i < ROUNDS_COUNT; i++) {

            boolean result = false;
            switch (gameName) {
                case "even":
                    result = hexlet.code.games.Even.start(name, scanner);
                    break;
                case "calc":
                    result = hexlet.code.games.Calculator.start(name, scanner);
                    break;
                case "gcd":
                    result = hexlet.code.games.GCD.start(name, scanner);
                    break;
                case "pro":
                    result = hexlet.code.games.Progression.start(name, scanner);
                    break;
                case "prime":
                    result = hexlet.code.games.Prime.start(name, scanner);
                    break;
                default:
                    System.out.println("Unknown game");
            }
            if (!result) {

                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");

    }

    public static boolean examine(String question, String correctAnswerStr, String userName, Scanner scanner) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String userAnswerStr = scanner.nextLine().trim();

        if (userAnswerStr.equals(correctAnswerStr)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + userAnswerStr + "' is wrong answer ;(. Correct answer was '" + correctAnswerStr + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }
}