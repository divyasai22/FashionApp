package com.fashionapp.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component("mailsender")
public class MailSender {
	@Autowired
	private JavaMailSender sender;
	
	public void sendmail(String mail) {
		// TODO Auto-generated method stub
	MimeMessage msg = sender.createMimeMessage();
	MimeMessageHelper helper = new MimeMessageHelper(msg);
	try {
		helper.setTo(mail);
		helper.setSubject("FashionApp login ");
		helper.setText("Hi...You have succesfully Registered with FashionApp");
	} catch (MessagingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sender.send(msg);
		
	}
	
	public void sendForgetPwdMail(String mail) {
		// TODO Auto-generated method stub
	MimeMessage msg = sender.createMimeMessage();
	MimeMessageHelper helper = new MimeMessageHelper(msg);
	try {
		String text =null;
		helper.setTo(mail);
		helper.setSubject("Change Password");
		text = "Click the below link to ";
//		text += "\\n<a href='www.google.com'>ChangePassword</a>";
		helper.setText(text);
	} catch (MessagingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sender.send(msg);
		
	}

}
