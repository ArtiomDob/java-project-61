
package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {

    private static final int ROUNDS_COUNT = 3;
    private static int correctAnswersCount = 0;
   private static final Scanner SCANNER = new Scanner(System.in);

    public static void runGame(String gameName, Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");

        switch (gameName) {
            case "even":
                Even.start(scanner, name);
                break;
            case "calc":
                hexlet.code.games.Calculator.start(scanner, name);
                break;
            //  case "gcd":
            //    hexlet.code.games.GCD.start(scanner, name);
            //    break;
            default:
                System.out.println("Unknown game");

        }

    }

    public static void examination(String userAnswer, String correctAnswerStr, String userName) {// проверяем
        if (userAnswer.equals(correctAnswerStr)) {//сравниваем
            System.out.println("Correct!");
            correctAnswersCount++;
            if (correctAnswersCount == ROUNDS_COUNT) {//когда количество правильных ответов сравняется с количесвом раундов
                System.out.println("Congratulations, " + userName + "!");// если правильно три раза
            }
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswerStr + "'.");
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}






