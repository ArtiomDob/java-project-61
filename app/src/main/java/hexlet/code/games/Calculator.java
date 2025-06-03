
package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

public class Calculator {
    private static final int ROUNDS_COUNT = 3;

    public static boolean start(Scanner scanner, String name) {
        Random random = new Random();
        char[] operations = {'+', '-', '*'};

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(101);
            int num2 = random.nextInt(101);
            char operation = operations[random.nextInt(operations.length)];

            System.out.println("Question: " + num1 + " " + operation + " " + num2);
            System.out.print("Your answer: ");
            String userAnswerStr = scanner.nextLine().trim();

            int correctAnswer;
            switch (operation) {
                case '+':
                    correctAnswer = num1 + num2;
                    break;
                case '-':
                    correctAnswer = num1 - num2;
                    break;
                case '*':
                    correctAnswer = num1 * num2;
                    break;
                default:
                    correctAnswer = 0;
            }

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
}


