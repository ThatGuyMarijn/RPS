import java.util.Scanner;

public class Play {
    public boolean letsPlay;

    public boolean playGame() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Do you want to play RPS? (y/n)");
        String wannaPlay = userInput.nextLine();

        if (wannaPlay.equals("y") || wannaPlay.equals("Y")) {
            letsPlay = true;
            return letsPlay;

        } else if (wannaPlay.equals("n") || wannaPlay.equals("N")) {
            letsPlay = false;
            return letsPlay;

        } else {
            letsPlay = false;
            return letsPlay;
        }
    }
}
