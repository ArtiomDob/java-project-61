package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int ROUNDS_COUNT = 3;

    public static boolean start(Scanner scanner, String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(100);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            String question = number + "!";

            boolean examinationResult = Engine.examination(question, correctAnswer, name);

            if (!examinationResult) {
                return false;
            }
        }
        return false;
    }
}
