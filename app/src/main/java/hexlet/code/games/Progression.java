
package hexlet.code.games;

import static hexlet.code.Engine.ROUNDS_COUNT;

import java.util.Random;

import hexlet.code.Engine;

public class Progression {
    private static final int MIN_LENGTH = 5;   // Минимальная длина прогрессии
    private static final int MAX_LENGTH = 10;  // Максимальная длина прогрессии


    public static boolean start(String name) {
        System.out.println("What number is missing in the progression?");

        Random rand = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String[] progressionData = generateProgression(rand);
            String question = progressionData[0];
            String correctAnswer = progressionData[1];

            boolean examinationResult = Engine.examine(question, correctAnswer, name);

            if (!examinationResult) {
                return false;
            }
        }
        return false;
    }

    private static String[] generateProgression(Random rand) {
        int length = rand.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH; // длина от 5 до 10
        int start = rand.nextInt(20); // стартовое число
        int step = rand.nextInt(10) + 1; // шаг прогрессии (от 1 до 10)

        int hiddenPosition = rand.nextInt(length); // точка пропуска

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
