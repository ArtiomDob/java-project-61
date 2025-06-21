package hexlet.code.games;

import java.util.Random;

import java.util.Scanner;

import hexlet.code.Engine;

public class Prime {
    private static boolean instructionShown = false;

    public static boolean start(String name, Scanner scanner) {
        if (!instructionShown) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            instructionShown = true;

        }

        Random random = new Random();
        int number = random.nextInt(100);
        String question = Integer.toString(number);
        String correctAnswer = isPrime(number) ? "yes" : "no";

        return Engine.examine(question, correctAnswer, name, scanner);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
