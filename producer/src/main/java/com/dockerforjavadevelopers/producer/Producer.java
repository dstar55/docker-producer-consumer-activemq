package com.dockerforjavadevelopers.producer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class Producer {

	private JmsTemplate jmsTemplate;
	
	public void sendMessage(String message){

        MessageCreator messageCreator = createMessage(message);
        jmsTemplate.send(ProducerConfiguration.destination, messageCreator);			
	}
	
	
	private MessageCreator createMessage(final String message) {
		// Send a message
        MessageCreator messageCreator = new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        };
		return messageCreator;
	}


	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	
}
