import java.util.Scanner;

public class Player {
    public int playerHand;

    public int playerChoice() {
        Scanner hand = new Scanner(System.in);
        System.out.println("\n\nWhat do you want to play?");
        System.out.println("0. Rock | 1. Paper | 2. Scissors");
        playerHand = hand.nextInt();
        return playerHand;
    }
}
