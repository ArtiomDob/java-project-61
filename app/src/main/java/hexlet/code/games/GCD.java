package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCD {

    private static final int ROUNDS_COUNT = 3;
    private static final Random random = new Random();
    public static void start(Scanner scanner, String name){

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            boolean correct = playRound(scanner);
            if (!correct) {
                System.out.println("Let's try again " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    private static boolean playRound(Scanner scanner) {
        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;

        int answer = gcd(num1, num2);
        String question = num1 + " " + num2;

        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String userInput = scanner.nextLine().trim();

        int userAnswer;
        try {
            userAnswer = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println("'" + userInput + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
            return false;
        }

        if (userAnswer == answer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
            return false;
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
