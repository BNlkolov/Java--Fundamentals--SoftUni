package DataTypes.exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= number - 1; i++) {
            char firstChar = (char) ('a' + i);
            for (int j = 0; j <= number - 1; j++) {
                char secondChar = (char) ('a' + j);
                for (int k = 0; k <= number - 1; k++) {
                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}