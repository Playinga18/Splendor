import java.util.Objects;

public record Card(String color, Integer quantity) {
	public Card {
		 Objects.requireNonNull(color);
	     Objects.requireNonNull(quantity);
	}
	
	@Override
    public String toString() {
      return color + " : " + quantity;
    }
		
}
