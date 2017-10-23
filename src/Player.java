
public class Player {

	Card[] hand = new Card[100];
	public double bet;
	public boolean bust;
	public double money;
	
	
	public int handValue(){
		int x =0;
		int total = 0;
		while (hand[x]!= null){
		if(hand[x].value== 11 || hand[x].value==12 || hand[x].value==10){
			total+=10;
			x++;
		}else{
			total+=hand[x].value+1;
		x++;
		}
	}
			return total;

	}
	
	
	
	public boolean hitOrStay(){
		if(handValue() <17){
			return true;
	}else{
		return false;
	}
}
	
	public boolean bust(){
		if (handValue() >21){
			return true;
		}else{
			return false;
		}
	}
	
	public void play(Deck deck){
		boolean done = false;
		deck.deal(this);
		while (done == false){
		if (hitOrStay() == true){
			deck.hit(this);
			bust = bust();
			if(bust == true){
				done = true;
			}
		}else{
			done = true;
		}
		}
	}
	public void printCards(){
		int x = 0;
		
		while (hand[x]!=null){
			System.out.print(hand[x].value+1+" ");
			System.out.println(hand[x].findSuit());
			x++;
		}
		System.out.println("For a value of:"+handValue());
	}
	
	public void win(int numPlayers){
		money += bet*numPlayers;
		System.out.println("You win "+(bet*numPlayers)+" dollars!");
		System.out.println("You now have "+money+" dollars!");
	}
	
	public void lose(){
		money -= bet;
		System.out.println("You lose "+(bet)+" dollars!");
		System.out.println("You now have "+money+" dollars!");
	}
}
