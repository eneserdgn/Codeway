import java.util.Random;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetRounds = 0;
        while (targetRounds < 1 || targetRounds > 99) {
            System.out.print("Enter the target number of rounds (1-99): ");
            targetRounds = scanner.nextInt();
        }

        int player1Points = 0;
        int player2Points = 0;
        int player3Points = 0;

        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-8s %-8s\n", "ROUND", "DICE1", "DICE2", "DICE3", "TOTAL1", "TOTAL2", "TOTAL3");
        System.out.println("------------------------------------------------------------");

        for (int round = 1; round <= targetRounds; round++) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int dice3 = random.nextInt(6) + 1;

            if (dice1 == dice2 && dice2 == dice3) {
                player1Points += dice1;
                player2Points += dice2;
                player3Points += dice3;
            } else if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
                player1Points += dice1;
                player2Points += dice2;
                player3Points += dice3;
            } else {
                if (dice1 == dice2 && dice1 > dice3) {
                    player1Points += dice1 * 2;
                    player2Points += dice2 * 2;
                    player3Points += dice3;
                } else if (dice1 == dice3 && dice1 > dice2) {
                    player1Points += dice1 * 2;
                    player3Points += dice3 * 2;
                    player2Points += dice2;
                } else if (dice2 == dice3 && dice2 > dice1) {
                    player2Points += dice2 * 2;
                    player3Points += dice3 * 2;
                    player1Points += dice1;
                } else {
                    player1Points += dice1;
                    player2Points += dice2;
                    player3Points += dice3;
                }
            }

            System.out.printf("%-8d %-8d %-8d %-8d %-8d %-8d %-8d\n", round, dice1, dice2, dice3, player1Points, player2Points, player3Points);
        }
        scanner.close();
    }
}
