package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    private static boolean instructionShown = false;

    public static boolean start(String name, Scanner scanner) {
        if (!instructionShown) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            instructionShown = true;
        }

        Random random = new Random();

        int number = random.nextInt(100); // один вопрос за раз
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        String question = Integer.toString(number);

        boolean result = Engine.examine(question, correctAnswer, name, scanner);

        return result;
    }
}