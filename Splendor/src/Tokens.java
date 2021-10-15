import java.util.HashMap;

public class Tokens {
	private final HashMap<String, Integer> tokens;
	
	public Tokens() {
		this.tokens = new HashMap<String, Integer>();
		
	}
	
	/* Ajoute un token dans le HashMap tokens */
	public void addToken(Token t) {
		if (t == null) {
			throw new NullPointerException();
		}
		
		tokens.put(t.type(), t.quantity());
	}
	
	/* Cette méthode représente en gros quand on va piocher une carte du paquet et donc on va faire -1 sur le couleur de la carte
	 qu'on a retirer
	 */
	public void pickToken(String type) {
		tokens.put(type, tokens.get(type) - 1);
		
	}
	
	/* Pour afficher la HashMap tokens */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (String key : tokens.keySet()) {
	           str.append(key);
	           str.append(" : ");
	           str.append(tokens.get(key));
	           str.append("\n");
		}
		
		return str.toString();
	}
}

