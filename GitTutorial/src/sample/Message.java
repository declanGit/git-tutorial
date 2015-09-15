package sample;

public class Message {
	
	private String text;
	
	public Message(String text) {
		this.text = text;
	}
	
	public String inform() {
		return "Tutorial for Git. " + text;
	}
}
