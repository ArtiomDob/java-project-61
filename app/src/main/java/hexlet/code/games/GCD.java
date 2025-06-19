package hexlet.code.games;

import static hexlet.code.Engine.ROUNDS_COUNT;

import java.util.Random;

import hexlet.code.Engine;

public class GCD {


    public static boolean start(String name) {
        System.out.println("Find the greatest common divisor of given numbers.");

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(100) + 1; // числа от 1 до 100
            int num2 = random.nextInt(100) + 1;
            String question = num1 + " " + num2;

            int correctAnswer = countGCD(num1, num2);
            String correctAnswerStr = Integer.toString(correctAnswer);

            boolean examinationResult = Engine.examine(question, correctAnswerStr, name);

            if (!examinationResult) {
                return false;
            }
        }
        return false;
    }

    private static int countGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}


