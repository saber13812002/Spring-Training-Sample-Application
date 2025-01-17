package designpattern;

public class Bridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSender textMessageSender = new TextMessageSender();
		Message textMessage = new TextMessage(textMessageSender);
		textMessage.send();

		MessageSender emailMessageSender = new EmailMessageSender();
		Message emailMessage = new EmailMessage(emailMessageSender);
		emailMessage.send();

	}

}

interface MessageSender {
	public void sendMessage();
}

class TextMessageSender implements MessageSender {
	@Override
	public void sendMessage() {
		System.out.println("TextMessageSender: Sending text message...");
	}
}

class EmailMessageSender implements MessageSender {
	@Override
	public void sendMessage() {
		System.out.println("EmailMessageSender: Sending email message...");
	}
}

abstract class Message {
	MessageSender messageSender;

	public Message(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	abstract public void send();
}

class TextMessage extends Message {

	public TextMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send() {
		messageSender.sendMessage();
	}

}

class EmailMessage extends Message {
	public EmailMessage(MessageSender messageSender) {
		super(messageSender);
	}

	@Override
	public void send() {
		messageSender.sendMessage();
	}

}
