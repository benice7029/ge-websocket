package com.baeldung.websockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ChatController {

	 @MessageMapping({"/chat/1"})
	 @SendTo({"/topic/messages/1"})
	 public OutputMessage send1(Message message) throws Exception {
		 String time = new SimpleDateFormat("HH:mm").format(new Date());
		 return new OutputMessage(message.getFrom(), message.getText(), time);
	 }

	 @MessageMapping({"/chat/2"})
	 @SendTo({"/topic/messages/2"})
	 public OutputMessage send2(Message message) throws Exception {
		 String time = new SimpleDateFormat("HH:mm").format(new Date());
		 return new OutputMessage(message.getFrom(), message.getText(), time);
	 }

}
