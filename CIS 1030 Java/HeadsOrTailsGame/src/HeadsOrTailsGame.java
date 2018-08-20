//Shannon P. Drake
//CIS 1030
//Programming Assignment 8

import java.util.Scanner;

public class HeadsOrTailsGame {

    //Setting up the heads or tails
    public static boolean match(String headOrTail, int toss){
        if(headOrTail.equalsIgnoreCase("H") && toss == 0){
            return true;
        }
        else if(headOrTail.equalsIgnoreCase("T") && toss == 1){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {

        // Creating players
        Player player1, player2;
        String name;
        String headOrTail;
        int toss;
        Coin coin = new Coin();

        // Creating scanners
        Scanner input = new Scanner(System.in);

        System.out.println("Let's play Heads or Tails");
        System.out.print("Enter the name of Player 1: ");
        name = input.nextLine();
        // initialize Player 1
        player1 = new Player(name);

        System.out.print("Enter the name of Player 2: ");
        name = input.nextLine();
        // initialize Player 2
        player2 = new Player(name);

        System.out.println("Away we go");
        System.out.println("[Enter H for Heads and T for Tails]");

        //Setting up the game loop

        while(true){
            // Player 1
            System.out.print("\n" + player1.getName() + "'s Turn: ");
            headOrTail = input.nextLine();
            // flip the coin
            toss = coin.toss();
            // if correct guess
            if(match(headOrTail, toss)){
                player1.setPoints(player1.getPoints() + 1);
            }
            else{
                player1.setPoints(player1.getPoints() - 1);
            }

            // Player 2
            System.out.print(player2.getName() + "'s Turn: ");
            headOrTail = input.nextLine();
            // flip the coin
            toss = coin.toss();
            // if correct guess
            if(match(headOrTail, toss)){
                player2.setPoints(player2.getPoints() + 1);
            }
            else{
                player2.setPoints(player2.getPoints() - 1);
            }

            //Scoring

            System.out.println("\nPonts:");
            System.out.println(player1.getName() + ": " + player1.getPoints());
            System.out.println(player2.getName() + ": " + player2.getPoints());

            // End the game
            if(player1.getPoints() >= 5){
                System.out.println("\n" + player1.getName() + " is the best");
                break;
            }
            if(player2.getPoints() >= 5){
                System.out.println("\n" + player2.getName() + " is the best");
                break;
            }
        }
        input.close();

    }

}
