package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

public class Prime {
    private static final int ROUNDS_COUNT = 3;

    public static boolean start(Scanner scanner, String name) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(100);
            String question = Integer.toString(number);
            String correctAnswer = Prime(number) ? "yes" : "no";


            boolean examinationResult = Engine.examination(question, correctAnswer, name);

            if (!examinationResult) {
                return false;
            }
        }
        return false;
    }
    private static boolean Prime(int num) {
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