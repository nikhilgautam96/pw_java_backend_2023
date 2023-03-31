package jan_31;
import java.util.*;
class Guesser {
    int gNum;
    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("GUESSER KINDLY GUESS THE NUMBER");
        gNum = sc.nextInt();
        return gNum;
    }
}
class Player {
    int pNum;
    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLAYER KINDLY GUESS THE NUMBER");
        pNum = sc.nextInt();
        return pNum;
    }
}
class Umpire {
    int numberFromGuesser;
    int numberFromPlayer1, numberFromPlayer2, numberFromPlayer3;
    public void getNumberFromGuesser() {
        Guesser g = new Guesser();
        numberFromGuesser = g.guessNumber();
    }

    public void getNumberFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numberFromPlayer1 = p1.guessNumber();
        numberFromPlayer2 = p2.guessNumber();
        numberFromPlayer3 = p3.guessNumber();
    }

    public void calcResult() {
        if(numberFromGuesser==numberFromPlayer1) {
			if(numberFromGuesser==numberFromPlayer2 && numberFromGuesser==numberFromPlayer3) {
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numberFromGuesser==numberFromPlayer2) {
				System.out.println("Player 1 and Player 2 won the game");
			}
			else if(numberFromGuesser==numberFromPlayer3) {
				System.out.println("Player 1 and Player 3 won ");
			}
			else {
			    System.out.println("Player 1 won the game");
			}
		}
		else if(numberFromGuesser==numberFromPlayer2) {
			if(numberFromGuesser==numberFromPlayer3) {
			    System.out.println("Player 2 and Player 3 won the game");
			}
			else {
				System.out.println("Player 2 won the game");
			}
		}
		else if(numberFromGuesser==numberFromPlayer3) {
			System.out.println("Player 3 won the game");
		}
		else {
			System.out.println("Game lost! try again");
		}
    }
    
}
public class Guesser_game {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.getNumberFromGuesser();
        u.getNumberFromPlayers();
        u.calcResult();
    }
}
