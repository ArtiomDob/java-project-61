
package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    private static int correctAnswersCount = 0;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void runGame(String gameName) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = SCANNER.nextLine().trim();
        System.out.println("Hello, " + name + "!");
        switch (gameName) {
            case "even":
                hexlet.code.games.Even.start(name);
                break;
            case "calc":
                hexlet.code.games.Calculator.start(name);
                break;
            case "gcd":
                hexlet.code.games.GCD.start(name);
                break;
            case "pro":
                hexlet.code.games.Progression.start(name);
                break;
            case "prime":
                hexlet.code.games.Prime.start(name);
                break;
            default:
                System.out.println("Unknown game");
        }
    }

    public static boolean examine(String question, String correctAnswerStr, String userName) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String userAnswerStr = SCANNER.nextLine().trim();

        if (userAnswerStr.equals(correctAnswerStr)) {
            System.out.println("Correct!");
            correctAnswersCount++;
            if (correctAnswersCount == ROUNDS_COUNT) {
                System.out.println("Congratulations, " + userName + "!");
                return true;
            }
        } else {
            System.out.println("'" + userAnswerStr + "' is wrong answer ;(. Correct answer was '" + correctAnswerStr + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
        return true;
    }
}

