package cards;

public class PlayingCards {

    private int _value;   
    private String _suit;
    public static final int CLUBS = 1;
    public static final int DIAMONDS = 2;
    public static final int HEARTS = 3;
    public static final int SPADES = 4;

 public void PlayingCards(int value,int suit) {
	 _value = value;
	 setSuit(suit);
 											  }
  
 public void setValue (int value) {
    if(0<value && value<14)
    	{
    	_value = value;
    	}
    else {
    	System.out.println("invalid card value");
    	 }
 								  }
    
 public void setSuit (int suit) {
    	
    	if (suit ==1)
    	{
    		_suit = "clubs";
    	}
    	else if (suit ==2)
    	{
    		_suit = "diamonds";
    	}
    	else if (suit ==3)
    	{
    		_suit = "hearts";
    	}
    	else if (suit ==4)
    	{
    		_suit = "spades";
    	}
    	else 
    	{
    		System.out.println("invalid card value");
    	}
    	
    } 
 
 public String toString()
 {
	 if (_value == 1) {
		 return "ace of " + _suit;
	 				  }
	 else if (_value == 11) {
		 return "jack of " + _suit;
	 				  }
	 else if (_value == 12) {
		 return "queen of " + _suit;
	 				  }
	 else if (_value == 13) {
		 return "king of " + _suit;
	 				  }
	 else 			  {
		 return _value + " of " + _suit;
	 				  }
	 
 }
 
 
 
public int getValue()
{
	return _value;
}
public String getSuit()
{
	return _suit;
} 
   
    
 
	
	
}
