package hexlet.code.games;

import java.util.Random;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    private static boolean instructionShown = false;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static boolean start(String name, Scanner scanner) {
        if (!instructionShown) {
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            instructionShown = true;

        }
        Random rand = new Random();

        for (int i = 0; i < 1; i++) {
            String[] data = generateProgression(rand);
            String question = data[0];
            String answer = data[1];

            boolean result = Engine.examine(question, answer, name, scanner);

            if (!result) {
                return false;
            }
        }
        return true;
    }

    private static String[] generateProgression(Random rand) {
        int length = rand.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
        int start = rand.nextInt(20);
        int step = rand.nextInt(10) + 1;

        int hiddenPosition = rand.nextInt(length);

        StringBuilder sb = new StringBuilder();
        String answer = "";

        for (int i = 0; i < length; i++) {
            int currentElement = start + i * step;

            if (i == hiddenPosition) {
                sb.append("..");
                answer = Integer.toString(currentElement);
            } else {
                sb.append(currentElement);
            }

            if (i != length - 1) {
                sb.append(" ");
            }
        }

        return new String[]{sb.toString(), answer};
    }

}