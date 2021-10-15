import java.util.Objects;

public record Token(String type, Integer quantity) {
	public Token {
		 Objects.requireNonNull(type);
	     Objects.requireNonNull(quantity);
	}
	
	@Override
    public String toString() {
      return type + " : " + quantity;
    }
		
}

