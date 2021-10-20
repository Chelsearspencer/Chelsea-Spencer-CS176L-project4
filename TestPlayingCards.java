package cards;

import java.util.ArrayList;

public class TestPlayingCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[][] deck = new String[14][5];
		PlayingCards card = new PlayingCards();

		System.out.println("clubs:");
		
		for (int cardNum = 1; cardNum<14; cardNum++)
    	{
    		for(int suits = 1; suits<2; suits++)
    		{
    			card.setSuit(suits);
    			card.setValue(cardNum);
    			deck[cardNum][suits] = card.toString();
    			System.out.print(deck[cardNum][suits] +"   ");
    		}
    		System.out.println();

    	}
		
System.out.println();
System.out.println("diamonds:");

////////////////////////////////////////////////
		for (int cardNum = 1; cardNum<14; cardNum++)
    	{
    		for(int suits = 2; suits<3; suits++)
    		{
    			card.setSuit(suits);
    			card.setValue(cardNum);
    			deck[cardNum][suits] = card.toString();
    			System.out.print(deck[cardNum][suits] +"   ");
    		}
    		System.out.println();

    	}
System.out.println();
System.out.println("hearts:");

////////////////////////////////////////////////
		for (int cardNum = 1; cardNum<14; cardNum++)
		{
			for(int suits = 3; suits<4; suits++)
			{
				card.setSuit(suits);
				card.setValue(cardNum);
				deck[cardNum][suits] = card.toString();
				System.out.print(deck[cardNum][suits] +"   ");
			}
			System.out.println();

}
System.out.println();
System.out.println("spades:");

////////////////////////////////////////////////
		for (int cardNum = 1; cardNum<14; cardNum++)
		{
			for(int suits = 4; suits<5; suits++)
			{
				card.setSuit(suits);
				card.setValue(cardNum);
				deck[cardNum][suits] = card.toString();
				System.out.print(deck[cardNum][suits] +"   ");
			}
			System.out.println();

}    

     
	
		
		
		
		
	}

}
