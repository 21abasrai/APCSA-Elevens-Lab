import java.util.List;
import java.util.ArrayList;
//import java.lang.Math;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including initialize,
 * shuffle, deal, and check if empty.
 */

public class Deck {
  List<Card> cards;    
  int size;            
 
  /**
   * Creates a new <code>Deck</code> instance.<BR>
   * It pairs each element of ranks with each element of suits,
   * and produces one of the corresponding card.
   * @param ranks is an array containing all of the card ranks.
   * @param suits is an array containing all of the card suits.
   * @param values is an array containing all of the card point values.
   */
  public Deck(String[] ranks, String[] suits, int[] values) {
 cards = new ArrayList<Card>();
      for (int i = 0; i < ranks.length; i++) {
          Card aCard = new Card(ranks[i], suits[i], values[i]);
          cards.add(aCard);
      }
      size = cards.size();
  }
 
  //Determines if this deck is empty (no undealt cards).
  public boolean isEmpty() {
    return cards.isEmpty();
  }
 
  //Accessor method for the number of undealt cards in this deck.
  public int size() {
    return cards.size();
  }
 
  /**
   * Randomly permute the given collection of cards
   * and reset the size to represent the entire deck.
   */
  public void shuffle() {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
  }
 
  public Card deal() {
 if (isEmpty()) {
  return null;
 }
 size--;
 Card c = cards.get(size);
 return c;
  }
 
  /**
   * Generates and returns a string representation of this deck.
   * @return a string representation of this deck.
   */
  @Override
  public String toString() {
    String rtn = "size = " + size + "\nUndealt cards: \n";
   
    for (int k = size - 1; k >= 0; k--) {
      rtn = rtn + cards.get(k);
      if (k != 0) {
        rtn = rtn + ", ";
      }
      if ((size - k) % 2 == 0) {
        rtn = rtn + "\n";
      }
    }
   
    rtn = rtn + "\nDealt cards: \n";
    for (int k = cards.size() - 1; k >= size; k--) {
      rtn = rtn + cards.get(k);
      if (k != size) {
        rtn = rtn + ", ";
      }
      if ((k - cards.size()) % 2 == 0) {
        rtn = rtn + "\n";
      }
    }
   
    rtn = rtn + "\n";
    return rtn;
  }
}
