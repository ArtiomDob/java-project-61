package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

public class Progression {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_VALUE = 10;
    private static final int MIN_VALUE = 5;
    public static boolean start(Scanner scanner, String name) {
        System.out.println("What number is missing in the progression?");
        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {


            System.out.println("Question: " + num1 + " " + num2);
            System.out.print("Your answer: ");
            String userAnswerStr = scanner.nextLine().trim();




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

