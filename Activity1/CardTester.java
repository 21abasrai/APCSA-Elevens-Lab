/**
 * This is a class that tests the Card class.
 */
public class CardTester {

/**
* The main method in this class checks the Card operations for consistency.
* @param args is not used.
*/
public static void main (String [] args) {
	Card kingHearts10 = new Card("king","Hearts",10);
	Card queenClubs10 = new Card("queen","Clubs",10);
	Card jackDiamonds10 = new Card("jack","Diamonds",10);
	
	System.out.println("rank:" + kingHearts10.rank());
	System.out.println("suit:" + kingHearts10.suit());
	System.out.println("pointValue:" + kingHearts10.pointValue());
	System.out.println("toString" + kingHearts10.toString());
	System.out.println("Comparing kingHearts10 to queenClubs10 = " + kingHearts10.matches(queenClubs10));
	System.out.println();
	
	System.out.println("rank:" + queenClubs10.rank());
	System.out.println("suit:" + queenClubs10.suit());
	System.out.println("pointValue:" + queenClubs10.pointValue());
	System.out.println("toString:" + queenClubs10.toString());
	System.out.println("Comparing queenClubs10 to jacksDiamond10 = " + queenClubs10.matches(jackDiamonds10));
	System.out.println();
	
	System.out.println("rank:" + jackDiamonds10.rank());
	System.out.println("suit:" + jackDiamonds10.suit());
	System.out.println("pointValue:" + jackDiamonds10.pointValue());
	System.out.println("toString:" + jackDiamonds.toString());
	System.out.println("Comparing jackDiamonds10 to kingHearts10 = " + jackDiamonds10.matches(kingHearts10));
	System.out.println();
				    

}
}

