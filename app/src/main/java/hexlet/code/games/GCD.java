package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

public class GCD {
    private static final int ROUNDS_COUNT = 3;

    public static boolean start(Scanner scanner, String name) {
        System.out.println("Find the greatest common divisor of given numbers.");

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(100) + 1; // числа от 1 до 100
            int num2 = random.nextInt(100) + 1;

            System.out.println("Question: " + num1 + " " + num2);
            System.out.print("Your answer: ");
            String userAnswerStr = scanner.nextLine().trim();

            int correctAnswer = computeGCD(num1, num2);
            String correctAnswerStr = Integer.toString(correctAnswer);

            try {
                Engine.examination(userAnswerStr, correctAnswerStr, name);
            } catch (RuntimeException e) {
                return false;
            }
            if (!userAnswerStr.equals(correctAnswerStr)) {
                return false;
            }
        }
        return false;
    }

    private static int computeGCD(int a, int b) {
     while (b != 0) {
       int temp = b;
       b = a % b;
      a = temp;
     }
     return a;
    }
}
