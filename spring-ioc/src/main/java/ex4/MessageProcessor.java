package ex4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageProcessor implements ApplicationContextAware {
	private ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	     ctx = applicationContext;
	     System.out.println("Application context injected");
		
	}
	public MessageProcessor() {
		System.out.println("Message processor constructor");
	}
	

	public void process(String type, String to, String msg) {
		
	Message m =(Message) ctx.getBean(type);
	m.send(to, msg);
	
	}

	

}
