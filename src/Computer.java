import java.util.Random;

public class Computer {
    public int computerChoice;

    public int computer() {
        Random rand = new Random();
        computerChoice = rand.nextInt(2);
        return computerChoice;
    }
}
