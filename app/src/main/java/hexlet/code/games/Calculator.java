/*package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calculator {
    private static final int ROUNDS = 3;
    private static final Random RANDOM = new Random();

    public static void start() {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        String name = Engine.getUserName(scanner);

        for (int i = 0; i < ROUNDS; i++) {
            int num1 = RANDOM.nextInt(100);
            int num2 = RANDOM.nextInt(100);
            String operator = getRandomOperator();
            int correctAnswer = calculate(num1, num2, operator);

            System.out.printf("Question: %d %s %d%n", num1, operator, num2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(String.valueOf(correctAnswer))) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%d'.%n", userAnswer, correctAnswer);
                System.out.printf("Let's try again, %s!%n", name);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.printf("Congratulations, %s!%n", name);
    }

    private static String getRandomOperator() {
        String[] operators = {"+", "-", "*"};
        return operators[RANDOM.nextInt(operators.length)];
    }

    private static int calculate(int num1, int num2, String operator) {
        if (operator.equals("+")) {
            return num1 + num2;
        } else if (operator.equals("-")) {
            return num1 - num2;
        } else if (operator.equals("*")) {
            return num1 * num2;
        } else {
            throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
} */
package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calculator {

    private static final String[] OPERATIONS = {"+", "-", "*"};
    private static final int ROUNDS_COUNT = 3; // Количество раундов
    private static final Random random = new Random();

    // Метод для запуска всей игры
    public static void start(Scanner scanner) {
        System.out.println("Welcome to the Brain Calculator Game!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            boolean correct = playRound(scanner);
            if (!correct) {
                System.out.printf("Let's try again, %s!\n", name);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", name);
    }

    // Метод для одного раунда
    public static boolean playRound(Scanner scanner) {
        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;
        String operation = OPERATIONS[random.nextInt(OPERATIONS.length)];

        int correctAnswer = calculate(num1, num2, operation);

        System.out.println("Question: " + num1 + " " + operation + " " + num2);
        System.out.print("Your answer: ");
        String userInput = scanner.nextLine().trim();

        int userAnswer;
        try {
            userAnswer = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.println("'" + userInput + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }

        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            return false;
        }
    }

    private static int calculate(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                throw new IllegalStateException("Unexpected operation: " + op);
        }
    }
}