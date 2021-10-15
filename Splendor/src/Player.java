
public class Player {
	private int point;
	private int numberToken;
	private int numberCard;
	
	public Player() {
		this.point = 0;
		this.numberToken = 0;
		this.numberCard = 0;
	}
	
	public void addPoint(Integer p) {
		point += p;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void addNumberToken(Integer t) {
		numberToken += t;
	}
	
	public int getNumberToken() {
		return numberToken;
		
	}
	public void addNumberCard() {
		numberCard += 1;
	}
	
	public int getNumberCard() {
		return numberCard;
	}
	
	
}
