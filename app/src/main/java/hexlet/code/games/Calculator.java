
package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

public class Calculator {
    private static final int ROUNDS_COUNT = 3;

    public static boolean start(Scanner scanner, String name) {
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        char[] operations = {'+', '-', '*'};

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(101);
            int num2 = random.nextInt(101);
            char operation = operations[random.nextInt(operations.length)];

            String question = num1 + " " + operation + " " + num2;

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


          boolean  examinationResult = Engine.examination(question, correctAnswerStr, name);

          if (!examinationResult) {
                return false;
            }
        }
        return false;
    }
}


