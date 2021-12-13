package ex8;

import org.springframework.stereotype.Component;

@Component("Msg")
public interface Message {
	void send(String to , String msg);
	
	 

}

