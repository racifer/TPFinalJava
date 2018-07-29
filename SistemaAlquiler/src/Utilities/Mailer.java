package Utilities;

import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {
	public static void EnviarEmail(Entities.Mail mail) throws MessagingException {
		 Properties props = new Properties(); //propiedades a agragar  
		 props.put("mail.smtp.port", "587"); //puesto de salida  
		 props.put("mail.smtp.starttls.enable", "true"); //inicializar el servidor  
		 props.put("mail.smtp.auth", "true"); //autentificacion   
		 String identifica = mail.getOrigen().substring(  
		 mail.getOrigen().indexOf("@") + 1,  
		 mail.getOrigen().indexOf("@") + 6);  
		 if (identifica.equals("gmail")) {  
			 props.put("mail.smtp.host", "smtp.gmail.com"); //tipo de servidor        
		     props.put("mail.smtp.socketFactory.port", "465"); //activar el puerto  
		     props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");  
		     props.put("mail.smtp.socketFactory.fallback", "false");  
		 } else {  
		     props.put("mail.smtp.host", "smtp.live.com"); //tipo de servidor  
		 }
		 Session session=Session.getInstance(props,new javax.mail.Authenticator() {
             protected PasswordAuthentication getPasswordAuthentication() {
                 return new PasswordAuthentication(mail.getOrigen(), mail.getPassword());
             }
         });
		 Message msg = new MimeMessage(session);
		 msg.setFrom(new InternetAddress(mail.getOrigen()));
		 for (String string : mail.getTo()) {
			msg.addRecipient(RecipientType.TO, new InternetAddress(string));
		 }
		 for (String string : mail.getCc()) {
				msg.addRecipient(RecipientType.CC, new InternetAddress(string));
		 }
		 for (String string : mail.getBcc()) {
				msg.addRecipient(RecipientType.BCC, new InternetAddress(string));
		 }
		 msg.setSubject(mail.getAsunto());
		 msg.setText(mail.getCuerpo());
		 Transport.send(msg);
	}
	
}
