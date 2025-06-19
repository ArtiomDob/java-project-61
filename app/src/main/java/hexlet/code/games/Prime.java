package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Engine.ROUNDS_COUNT;

import hexlet.code.Engine;

public class Prime {


    //public static boolean start(String name,String rounds[][]) {
    public static boolean start(String name) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Random random = new Random();
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            //  for (String[]round : rounds) {
            //    String question = round[0];
            //   String correctAnswer = round[1];
            int number = random.nextInt(100);
            String question = Integer.toString(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";


            boolean examinationResult = Engine.examine(question, correctAnswer, name);
            //массив строк

            if (!examinationResult) {
                return false;
            }
        }
        return false;
    }

    private static boolean isPrime(int num) {
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
