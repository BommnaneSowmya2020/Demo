package ex9;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestExcahnge {
	
	@Test
	public void tetsConfig() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ExchangeConfig.class);
	
		ExchangeService es =(ExchangeService) ctx.getBean("ex");
			es.convert();
	}

}
