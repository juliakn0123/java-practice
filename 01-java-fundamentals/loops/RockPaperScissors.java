package loops;

import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {

    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;

    public static void main(String[] args) {

        String computerValue;
        String userChoice;
        int userValue;
        String answer;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            while (true) {
                System.out.println("Choose: Rock, Paper, Scissors: ");
                userChoice = scanner.nextLine().trim().toLowerCase();

                if (userChoice.equals("rock")) {
                    userValue = ROCK;
                    break;
                } else if (userChoice.equals("paper")) {
                    userValue = PAPER;
                    break;
                } else if (userChoice.equals("scissors")) {
                    userValue = SCISSORS;
                    break;
                } else {
                    System.out.println("Invalid input! Try again!");
                }
            }


            int computerChoice = random.nextInt(3);

            if (computerChoice == 0) {
                computerValue = "rock";
            } else if (computerChoice == 1) {
                computerValue = "paper";
            } else {
                computerValue = "scissors";
            }


            System.out.printf("Your choice is %s and computer's choice is %s.%n", userChoice, computerValue);

            if (userChoice.equals(computerValue)) {
                System.out.println("It's a draw!");
            } else if ((userValue == ROCK && computerChoice == 2)
                    || (userValue == PAPER && computerChoice == 0)
                    || (userValue == SCISSORS && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }


            while (true) {
                System.out.println("Would you like to play again? y/n");

                answer = scanner.nextLine().trim().toLowerCase();
                if (answer.equals("y")) {
                    break;
                } else if (answer.equals("n")) {
                    System.out.println("Goodbye!");
                    break;
                } else {
                    System.out.println("\"Invalid answer! Enter y or n.\"");
                }
            }


            if (answer.equals("n")) {
                break;
            }


        } while (true);

    }
}