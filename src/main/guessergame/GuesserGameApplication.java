package main.guessergame;

import java.util.Scanner;

class Guesser{
    
    public int guessNum;

    int guessingNumber(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Guesser, guess a number :");
    guessNum = scan.nextInt();
    return guessNum;
    }
}

class Player{

    public int guessNum;

    int guessingNumber(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Player, guess a number :");
    int guessNum = scan.nextInt();
    return guessNum;
    }
}

class Umpire{

    int numFromGuesser;

    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    
    void collectNumFromGuesser(){
    Guesser guesser = new Guesser();
    numFromGuesser = guesser.guessingNumber();
    }

    void collectNumFromPlayer(){
        Player player1 = new Player();
        numFromPlayer1= player1.guessingNumber();

        Player player2 = new Player();
        numFromPlayer2 = player2.guessingNumber();

        Player player3 = new Player();
        numFromPlayer3 = player3.guessingNumber();
    }

    void compare()
    {
        if(numFromGuesser == numFromPlayer1){
            System.out.println("Player1 won the game as you have guessed the number correctly...");
        }
        else if(numFromGuesser == numFromPlayer2){
            System.out.println("Player2 won the game as you have guessed the number correctly...");
        }
        else if(numFromGuesser == numFromPlayer3){
            System.out.println("Player3 won the game as you have guessed the number correctly...");
        }
        else{
            System.out.println("Try again, nobody won the game");
        }
    }
}

public class GuesserGameApplication {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.collectNumFromGuesser();
        umpire.collectNumFromPlayer();
        umpire.compare();
    }

}
