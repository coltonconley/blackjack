
public class Card {

	public int suit;
	public int value;
	public boolean inDeck;
	
	
	Card(){
		inDeck = true;
	}
	
	Card(int x, int y){
		inDeck = true;
		suit = y;
		value = x;
	}
	public String findSuit(){
		if(suit == 0){
			String suitX = new String("diamonds");
			return suitX;
		}else if (suit == 1){
			String suitX = new String("hearts");
			return suitX;
		}else if (suit == 2){
			String suitX = new String("spades");
			return suitX;
		}else if(suit == 3){
			String suitX = new String("clubs");
			return suitX;
		}else{
			String suitX = new String(" ");
			return suitX;
		}
	}
}
