package bonjour;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BonjourTest {
	private Bonjour b;

	@BeforeEach
	void setUp() throws Exception {
		b=new Bonjour();
	}
	
	@Test
	void bonjour_bob() {
		assertEquals("Hello, bob",b.welcome("bob"));
		assertEquals("Hello, Bob",b.welcome("Bob"));
	}

}
