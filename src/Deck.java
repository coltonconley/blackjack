import java.util.Random;
public class Deck {
	
	public Card[] cards = new Card[52];
	Deck(){
		
		int z = 0;
		for(int x=0;x<13;x++){
			for(int y=0; y<4; y++){
				cards[z] = new Card(x,y);
				z++;
			}
		}
	}

	
	public void shuffle(){
		Random random = new Random();
		for(int x=0; x<10000; x++){
			int z = random.nextInt(52);
			int y = random.nextInt(52);
			int first1 = cards[z].value;
			int first2 = cards[z].suit;
			cards[z].value = cards[y].value;
			cards[z].suit = cards[y].suit;
			cards[y].value = first1;
			cards[y].suit = first2;
		}
	}
	
	public void deal(Player playerX){
		int dealt = 0;
		int x = 0;
		while (dealt <2){
			if(cards[x].inDeck == true){
				cards[x].inDeck=false;
				playerX.hand[dealt]=cards[x];
				dealt++;
			}
			
			x++;
		}
		
		
	}
	
	public void hit(Player playerX){
		int dealt = 0;
		int x = 0;
		boolean hit=false;
		while (hit == false){
			if(cards[x].inDeck == true&&playerX.hand[dealt]==null){
				cards[x].inDeck=false;
				playerX.hand[dealt]=cards[x];
				hit = true;

			}else if(playerX.hand[dealt]!=null){
				dealt++;
			}
		
			x++;
		}
}
}