import java.util.Random;

/**
 * Chapter 6
 * Programming Challenge 14: Heads or Tails Game
 * The Coin class stores data for a coin that can be tossed.
 */

public class Coin
{
    private String sideUp; // The side facing up

    /**
     * The constructor randomly sets the side of
     * the coin that is facing up: heads or tails.
     */

    public Coin()
    {
        // Call the toss method to set the
        // initial state of sideUp.
        toss();
    }

    /**
     * The toss method simulates the tossing of
     * the coin. After the method executes, the
     * sideUp field will be randomly set to either
     * "heads" or "tails".
     */

    public int toss()
    {
        // Create a random object.
        Random rand = new Random();

        // Get a random value, 0 or 1.
        int value = rand.nextInt(2);

        // Set the value of sideUp.
        // 0 = "heads" or 1 = "tails"
        if (value == 0)
            sideUp = "heads";
        else
            sideUp = "tails";
        return value;
    }

    /**
     * The getSideup method
     */

    public String getSideUp()
    {
        return sideUp;
    }
}