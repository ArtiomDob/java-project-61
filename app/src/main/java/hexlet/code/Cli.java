package hexlet.code;

import java.util.Scanner;

public class Cli {

  public static void welcome() {
      System.out.print("Welcome to the Brain Games! ");
        Scanner userInputScanner = new Scanner(System.in);
       // System.out.print("Welcome to the Brain Games! ");
        System.out.print("May I have your name? ");
        String userInputName = userInputScanner.nextLine();
        System.out.println("Hello, " + userInputName + "!");
    }
}