import java.util.Random;

/**
 * Chapter 6
 * Programming Challenge 14: Heads or Tails Game
 * The Player class simulates a player in the
 * Heads or Tails Game.
 */

public class Player
{
    // Fields
    private String name;    // The player's name
    private String guess;   // The player's guess
    private int points;     // The player's points

    /**
     * The constructor accepts an argument for
     * the player's name.
     */

    public Player (String n)
    {
        name = n;
        guess = "";
        points = 0;
    }



    /**
     * The getName method returns
     * the name of the player.
     */

    public String getName()
    {
        return name;
    }

    /**
     * The getGuess method returns the player's guess.
     */

    public String getGuess()
    {
        return guess;
    }

    /**
     * The getName method returns
     * the number of points.
     */

    public int getPoints()
    {
        return points;
    }

    /**
     * The setName method accepts an
     * argument for the name of the player.
     */

    public void setName(String n)
    {
        name = n;
    }

    /**
     * The setGuess method accepts an
     * argument for the guess of the player.
     */

    public void setGuess(String g)
    {
        guess = g;
    }

    /**
     * The setPoints method accepts an
     * argument for the player's points.
     */

    public void setPoints(int p)
    {
        points = p;
    }
}
