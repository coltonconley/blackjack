import java.util.Scanner;
import java.util.InputMismatchException;
public class RunFinalGame {

	public static void main(String[] args) {
		
		try{
		double money2 = 100;
		Blackjack play = new Blackjack();
		boolean keepPlaying = true;
		Scanner imput = new Scanner(System.in);	
		System.out.println("Welcome to Blackjack!");
		
		while(keepPlaying == true){
			money2 = play.runBlackjack(money2);

			System.out.println("Would you like to keep playing? <1>yes <2>no");
			int newImput = imput.nextInt();
			if (newImput == 1){
			keepPlaying=true;
			
		}else{
			keepPlaying = false;
		}
}
		imput.close();
		}catch(InputMismatchException e){
			System.out.println("Thought you were smart huh?");
			
			
		}
}
}





//this is the code to type out the deck
/*for (int x=0 ; x<52; x++){
System.out.println(deck.cards[x].suit);
System.out.println(deck.cards[x].value);
}


code to test hit or stay method

if (player.hitOrStay()==true){
			System.out.println("You should hit");
			deck.hit(player);
			System.out.println("You hit a" +player.hand[2].value);
		}else{
			System.out.println("You should stay");
		}


code to test value and suit
System.out.println("Your hand is:");
		System.out.println(player1.hand[0].value+1);
		System.out.println(player1.hand[0].suit);



*
*
*
*
*
*
*
*
*
*
*/