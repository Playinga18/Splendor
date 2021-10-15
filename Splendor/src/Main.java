public class Main {
	public static void main(String[] args) {
		/* cardPackage représente le paquet de carte*/
		var cardPackage = new Cards();
		var stackToken = new Tokens();
		
		/* Ici on inititalise 8 cartes pour chaque couleur */
		var green = new Card("Green", 8);
		var white = new Card("White", 8);
		var blue = new Card("Blue", 8);
		var black = new Card("Black", 8);
		var red = new Card("Red", 8);
		
		/*On ajoute les cartes dans le paquet */
		cardPackage.addCard(green);
		cardPackage.addCard(white);
		cardPackage.addCard(blue);
		cardPackage.addCard(black);
		cardPackage.addCard(red);
		
		/*On initialise les differents pile de jetons */
		var emerald = new Token("Emerald", 4);
		var diamond = new Token("Diamond", 4);
		var sapphire = new Token("Sapphire", 4);
		var onyx = new Token("Onyx", 4);
		var ruby = new Token("Ruby", 4);
		
		/*On rajoute chaque token dans le HashMap stackToken */
		stackToken.addToken(emerald);
		stackToken.addToken(diamond);
		stackToken.addToken(sapphire);
		stackToken.addToken(onyx);
		stackToken.addToken(ruby);
		
		/* On initialise les deux joueurs */
		var player1 = new Player();
		var player2 = new Player();
		
		
		
	}

}
