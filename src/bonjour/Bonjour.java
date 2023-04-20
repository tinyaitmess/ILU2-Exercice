package bonjour;

public class Bonjour {
	
	public String welcome(String nom) {
		StringBuilder salutation = new StringBuilder();
		salutation.append("Hello, ");
		return "Hello, "+nom ;
	}
}
