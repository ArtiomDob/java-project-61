package hexlet.code.games;

import static hexlet.code.Engine.ROUNDS_COUNT;

import hexlet.code.Engine;

import java.util.Random;

public class Even {


    public static boolean start(String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(100);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            String question = number + "!";

            boolean examinationResult = Engine.examine(question, correctAnswer, name);

            if (!examinationResult) {
                return false;
            }
        }
        return false;
    }
}
