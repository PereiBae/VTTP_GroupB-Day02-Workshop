package myapp;

import java.io.Console;
import java.lang.System;

public class MainDeck {
    
    public static void main (String[] args){
        
        Deck deck = new Deck();
        boolean stop = false;
        Console cons = System.console();
        
        while (!stop){
            String cmd = cons.readLine(">Welcome to the Casino. Draw or Shuffle? ").trim();

            switch (cmd){
                case "DRAW":
                System.out.println(deck.drawCard());
                break;
                case "SHUFFLE":
                deck.shuffle();
                System.out.println("The Deck has been shuffled");
                break;
                case "BREAK":
                stop = true;
                break;

            }
        }

    }

}
