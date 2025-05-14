package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static void start(Scanner scanner) {
        // Выводим приветствие
        System.out.println("Welcome to the Brain Games!");
        // Спрашиваем имя пользователя
        System.out.print("May I have your name? ");
        String name = scanner.nextLine().trim();
        // Приветствуем пользователя по имени
        System.out.println("Hello, " + name + "!");
    }
}