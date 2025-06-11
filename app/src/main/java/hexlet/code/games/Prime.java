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
             System.out.println("Question: " + question);
             System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();
            //boolean question = Prime(number) ? "yes" : "no";
            String correctAnswer = Prime(number) ? "yes" : "no";

             try {
                Engine.examination(userAnswer, correctAnswer, name);
            } catch (RuntimeException e) {
               return false;
             }

            if (!userAnswer.equals(correctAnswer)) {
                return false;
             }
              }
                  return false;

             }
           // boolean examinationResult = Engine.examination(question, correctAnswerStr, name);


           // if (!examinationResult) {
               // return false;
           // }
       // }
        //return false;
    //}
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