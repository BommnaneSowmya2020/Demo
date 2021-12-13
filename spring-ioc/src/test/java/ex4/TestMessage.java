package ex4;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {
	
	@Test
	public void testSend() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ex4ctx.xml");
			
		   MessageProcessor mp =(MessageProcessor) ctx.getBean("mp");
	          
			mp.process("sms", "3456798", "How are you");
			mp.process("email", "sowmyareddy337@gmail.com", "Whatsup?");
	}

}
