
package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

public class Progression {
    private static final int ROUNDS_COUNT = 3;
    private static final int MIN_LENGTH = 5;   // Минимальная длина прогрессии
    private static final int MAX_LENGTH = 10;  // Максимальная длина прогрессии

    public static boolean start(Scanner scanner, String name) {
        System.out.println("What number is missing in the progression?");

        Random rand = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String[] progressionData = generateProgression(rand);
            String question = progressionData[0];
            String correctAnswer = progressionData[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswerStr = scanner.nextLine().trim();

            try {
                Engine.examination(userAnswerStr, correctAnswer, name);
            } catch (RuntimeException e) {
                return false;
            }
            if (!userAnswerStr.equals(correctAnswer)) {
                return false;
            }
        }

        return false;
    }

    private static String[] generateProgression(Random rand) {
        int length = rand.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH; // длина от 5 до 10
        int start = rand.nextInt(20); // стартовое число (можно увеличить диапазон)
        int step = rand.nextInt(10) + 1; // шаг прогрессии (от 1 до 10)

        int hiddenPosition = rand.nextInt(length); // позиция пропуска

        StringBuilder progressionBuilder = new StringBuilder();
        String correctAnswer = "";

        for (int index = 0; index < length; index++) {
            int currentElement = start + index * step;

            if (index == hiddenPosition) {
                progressionBuilder.append("..");
                correctAnswer = Integer.toString(currentElement);
            } else {
                progressionBuilder.append(currentElement);
            }
            if (index != length - 1) {
                progressionBuilder.append(" ");
            }
        }

        return new String[]{progressionBuilder.toString(), correctAnswer};
    }
}
