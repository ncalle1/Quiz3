package Core;

import java.util.ArrayList;
import java.util.Collections;

import Enum.eRank;
import Enum.eSuit;

public class Deck {

	private int count=0;
	private ArrayList<Card> cards = new ArrayList<Card>();

	
	public Deck() {
		BuildDeck(1);
	}
	public Deck(int a) {
		BuildDeck(a);
	}
	public void BuildDeck(int a) {
		do {
			for (eSuit suit : eSuit.values()) {
				for (eRank rank : eRank.values()) {
					cards.add(new Card(suit, rank));
				}
			}
			a--;
		} while (a > 0);
		Collections.shuffle(cards);
	}
	
	public int getSize() {
		return this.cards.size();
	}
	public ArrayList<Card> getDeck() {
		return this.cards;
	}

	public Card draw() {
		return this.cards.remove(0);
	}
	
	public int getRemaining(Object eNum) {
		
		for(int i=0; i<cards.size(); i++) {
		
			if(cards.get(i).geteRank()==eNum || cards.get(i).geteSuit()==eNum) {
				count+=1;
			}
			
		}
		
		return count;
		
		
		
	}
	
	
	
}