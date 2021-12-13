import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSubscription {
	
	public Subscription subs;
	
	@BeforeEach
	public void init() {
		subs = new Subscription();
	}
	
	@Test
	public void testMonthly() {
		assertEquals(100,subs.monthly());
		
	}
	
	@Test
	public void TestQuarterly() {
		assertEquals(250,subs.quarterly());
	}
	
	public void testAnnually() {
		assertEquals(100,subs.annually());
	}

}
