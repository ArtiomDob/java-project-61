package hexlet.code.games;

import java.util.Random;

import java.util.Scanner;

import hexlet.code.Engine;

public class Calculator {
    private static boolean instructionShown = false;

    public static boolean start(String name, Scanner scanner) {
        if (!instructionShown) {
            System.out.println("What is the result of the expression?");
            instructionShown = true;
        }
        Random random = new Random();
        char[] operations = {'+', '-', '*'};

        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        char operation = operations[random.nextInt(operations.length)];

        String question = num1 + " " + operation + " " + num2;

        int correctAnswer;
        switch (operation) {
            case '+':
                correctAnswer = num1 + num2;
                break;
            case '-':
                correctAnswer = num1 - num2;
                break;
            case '*':
                correctAnswer = num1 * num2;
                break;
            default:
                correctAnswer = 0;
        }

        String correctAnswerStr = Integer.toString(correctAnswer);

        return Engine.examine(question, correctAnswerStr, name, scanner);
    }
}
