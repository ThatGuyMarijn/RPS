public class Rock {
    public static void main(String[] args) {
        Play playGame = new Play();
        Computer ai = new Computer();
        Player player = new Player();
        playGame.playGame();

        boolean letsPlay = playGame.letsPlay;
        int rock = 0;
        int paper = 1;
        int scissors = 2;

        while (letsPlay != false) {
            ai.computer();
            player.playerChoice();
            int computerHand = ai.computerChoice;
            int playerHand = player.playerHand;
            // checks who wins
            if (playerHand == computerHand) {
                System.out.println("It's a tie");

            } else if (playerHand == rock && computerHand == scissors ||
                       playerHand == scissors && computerHand == paper ||
                       playerHand == paper && computerHand == rock) {
                System.out.println("You win!");
                System.out.println("Player: " + playerHand + " defeats " + "Computer: " + computerHand);

            } else {
                System.out.println("You lose! :(");
                System.out.println("Computer: " + computerHand + " defeats " + "Player: " + playerHand);
            }
        }

        // lets stop playing

    }
}
