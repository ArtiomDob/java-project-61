package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int ROUNDS_COUNT = 3;

    public static boolean start(Scanner scanner, String name) {

        Random random = new Random();

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = random.nextInt(100);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            System.out.print("Your answer: ");
            System.out.println("Question: " + number + "!");
            String userAnswer = scanner.nextLine().trim().toLowerCase();

          //   if (!userAnswer.equals(correctAnswer)) {
           //   System.out.print(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + "\n");
           //    System.out.println("Let's try again " + name + "!");

         //    }
         //   System.out.println("Correct!");
        //    }
        //     System.out.println("Congratulations, " + name + "!");
        //     }
//}
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
}
