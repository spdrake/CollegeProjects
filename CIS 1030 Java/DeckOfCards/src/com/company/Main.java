//Shannon P. Drake
//Coding Assignment 7
//CIS 1030
//Deck of Cards/War

//I don't actually know what this does but IntelliJ wants it and IntelliJ is much nicer than Eclipse
package com.company;

//I use Random and our beloved Scanner, so I'm bringing those in

import java.util.Random;
import java.util.Scanner;


//The "deck" class
class Deck {

    //Suits
    String suits[] = {"Hearts", "Spades", "Diamonds", "Clubs"};

    //Setting up a random
    Random ran = new Random();

    //Initializing variables
   int cpuWin = 0;
    int playerWin = 0;

    //This is where we figure out what the card is
    String inputCard(int card) {
        int suit = card / 13;
        int rank = card % 13;
        String out = "";

        //Setting up the switch to give rank info
        switch (rank) {
            case 0:
                out = "Ace of " + suits[suit];
                break;
            case 10:
                out = "Jack of " + suits[suit];
                break;
            case 11:
                out = "Queen of " + suits[suit];
                break;
            case 12:
                out = "King of " + suits[suit];
                break;
            default:
                out = rank + " of " + suits[suit];
                break;
        }
        return out;
    }
//Figuring out who won right here
    int cpuTurn(int playerRanking) {
        int cpuRanking = this.ran.nextInt(52);
        //Determining results
        if (cpuRanking > playerRanking)
            cpuWin++;
        else
            playerWin++;
        //Adding scorekeeping
        System.out.println("Current score is Player: " + playerWin + " CPU: " + cpuWin);
        return cpuRanking;
    }
}

//The all important Main
public class Main {

    //Initializing a whole mess of variables, some of which don't actually get used
    int playerChoice = 0;
    int playerCard = 0;
    int cpuCard = 0;
    int cpuWin = 0;
    int playerWin = 0;
    int suit = 0;
    int rank = 0;
    int cpuTurn = 0;
    int playerScore = 0;

    public static void main(String[] args) {

        //calling the deck
        Deck datDeck = new Deck();
        int input = 0;
        Scanner scnr = new Scanner(System.in);
        while (input != 2) {
            System.out.println("Press 1 to play or 2 to exit");
            input = scnr.nextInt();
            if (input == 1) {
                System.out.println("Please enter the value of your card:");
                int card = scnr.nextInt();
                if (card >= 0 && card <= 51) {
                    int cpuCard = datDeck.cpuTurn(card);
                    System.out.println("Your card is: " + datDeck.inputCard(card));
                    System.out.println("The computer's card is: " + datDeck.inputCard(cpuCard));
                    System.out.println("The winner is " + (cpuCard> card? "The Computer" : "You"));

                } else {
                    System.out.println("Please enter a choice between 1 and 51");
                }
            }
        }
    }
}








