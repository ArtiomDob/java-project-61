package hexlet.code.games;
import java.util.Scanner;

public class Greet {
    public static void start(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
    }
}