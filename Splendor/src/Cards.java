import java.util.HashMap;

public class Cards {
	
	private final HashMap<String, Integer> cards;
	
	public Cards() {
		this.cards = new HashMap<String, Integer>();
		
	}
	
	/* Ajoute une carte dans le HashMap cards */
	public void addCard(Card c) {
		if (c == null) {
			throw new NullPointerException();
		}
		
		cards.put(c.color(), c.quantity());
	}
	
	/* Cette méthode représente en gros quand on va piocher une carte du paquet et donc on va faire -1 sur le couleur de la carte
	 qu'on a retirer
	 */
	public void updateQuantity(String color) {
		cards.put(color, cards.get(color) - 1);
		
	}
	
	/* Pour afficher la HashMap cards */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (String key : cards.keySet()) {
	           str.append(key);
	           str.append(" : ");
	           str.append(cards.get(key));
	           str.append("\n");
		}
		
		return str.toString();
	}
}
