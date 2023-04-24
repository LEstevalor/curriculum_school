import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		System.out.println("give you an integer between 1 and 100, please guess this number");
		int realNumber = random.nextInt(100) + 1;    
		                                             //random.nextInt(100) 是[0,100)之间的一个随机整数     
		int yourGuess = 0;
		System.out.println("input your guess number:");
		yourGuess = reader.nextInt();

		while(yourGuess != realNumber) 
		{
			if(yourGuess > realNumber)
			{
				System.out.println("Guessed a lot, please enter your guess again.");
				yourGuess = reader.nextInt();
			}
			else if(yourGuess < realNumber)
			{
				System.out.println("Guess is small, please enter your guess again.");
				yourGuess = reader.nextInt();
			}
		}
		System.out.println("Got it right!");
	}
}
