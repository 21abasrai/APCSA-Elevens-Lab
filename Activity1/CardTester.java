/**
 * This is a class that tests the Card class.
 */
public class CardTester {

/**
* The main method in this class checks the Card operations for consistency.
* @param args is not used in this code.
*/
public static void main(String[] args) {
Card aceClubs1 = new Card("ace", "clubs", 1);
Card sixHearts = new Card("6", "hearts", 6);
Card fiveClubs = new Card("5", "clubs", 5);


System.out.println("- ace of clubs Test -");
System.out.println("  rank: " + aceClubs1.rank());
System.out.println("  suit: " + aceClubs1.suit());
System.out.println("  pointValue: " + aceClubs1.pointValue());
System.out.println("  toString: " + aceClubs1.toString());
System.out.println();

System.out.println("- six of hearts Test -");
System.out.println("  rank: " + sixHearts.rank());
System.out.println("  suit: " + sixHearts.suit());
System.out.println("  pointValue: " + sixHearts.pointValue());
System.out.println("  toString: " + sixHearts.toString());
System.out.println();

System.out.println("- five of clubs Test -");
System.out.println("  rank: " + fiveClubs.rank());
System.out.println("  suit: " + fiveClubs.suit());
System.out.println("  pointValue: " + fiveClubs.pointValue());
System.out.println("  toString: " + fiveClubs.toString());
System.out.println();


}
}
