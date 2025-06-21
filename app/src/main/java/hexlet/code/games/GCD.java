package hexlet.code.games;

import java.util.Random;

import java.util.Scanner;

import hexlet.code.Engine;

public class GCD {
    private static boolean instructionShown = false;

    public static boolean start(String name, Scanner scanner) {
        if (!instructionShown) {
            System.out.println("Find the greatest common divisor of given numbers.");
            instructionShown = true;
        }
        Random random = new Random();

        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;

        String question = num1 + " " + num2;

        int correctAnswerInt = countGCD(num1, num2);
        String correctAnswerStr = Integer.toString(correctAnswerInt);

        return Engine.examine(question, correctAnswerStr, name, scanner);
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

