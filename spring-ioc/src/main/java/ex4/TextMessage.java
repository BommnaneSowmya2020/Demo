package ex4;

public class TextMessage implements Message{

	@Override
	public void send(String to, String msg) {
		System.out.println("SMS sent to" + to+ "as"+msg);
		
	}
	

}
