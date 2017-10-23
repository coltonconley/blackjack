import java.util.Scanner;


public class Blackjack {
	public double runBlackjack(double money2){
		
		boolean winnerFound = false;
		Deck deck = new Deck();
		System.out.println("How many players would you like to play with?");
		Scanner imput = new Scanner(System.in);
		int numPlayers = imput.nextInt();
		Player[] players = new Player[numPlayers];
		deck.shuffle();

		Player player = new Player();
		player.money=money2;
		System.out.println("How much would you like to bet this round?");
		player.bet = imput.nextDouble();
		if(player.money < player.bet){
			player.bet = player.money;
		}
		
		
		deck.deal(player);
		
		System.out.println("Your hand is:");
		player.printCards();
		boolean staying = false;
		int hitCounter=1; 
		
		while(staying == false){
		System.out.println("Would you like a hit? <1>yes <2>no");
		int hitting = imput.nextInt();
		if(hitting == 1){
			deck.hit(player);
			hitCounter++;
			System.out.println("You hit a " +(player.hand[hitCounter].value+1)+" for a value of "+player.handValue());
			if(player.bust() == true){
				System.out.println("You Busted!");
				staying = true;
			}
		}else{
			staying = true;
			
		}
	
		}
		
		
		for(int i =numPlayers-1; i>-1; i--){
			players[i] = new Player();
			players[i].play(deck);
			if(players[i].bust ==true ){
				System.out.println("Player"+(i+1)+" busted!");
			}else{
				System.out.println("Player"+(i+1)+" lives!  He had:");
				players[i].printCards();
			}
		}
		
		int z = 0;
		
		
		while(winnerFound == false && z< players.length){
			if(players[z].handValue() > player.handValue()){
				winnerFound = true;
			}else{
				z++;
			}
		}
		
		if(winnerFound == false){
			player.win(numPlayers);
			winnerFound = true;
		}else{
			player.lose();
		}
		return player.money;

	}



}
