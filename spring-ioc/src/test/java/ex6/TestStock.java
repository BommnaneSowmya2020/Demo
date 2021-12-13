package ex6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex6.Stock;

public class TestStock {
	@Test
	public void testStock() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("appctx.xml");
		
		Stock s1 =(Stock) appCtx.getBean("stk");
		Stock s2 =appCtx.getBean(Stock.class, "stl");
		
		System.out.println(s1 ==s2);
	}

}
