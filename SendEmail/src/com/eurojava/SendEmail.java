/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.util.Properties;

/*
 * http://www.oracle.com/technetwork/java/index-138643.html
 * 
 */

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Darek
 */
public class SendEmail {

    private static final String HOST = "smtp.gmail.com";
    private static final int PORT = 465;
    private static final String FROM = "xxxx@gmail.com";
    private static final String PASSWORD = "xxx";
    private static final String TO = "yyyy@gmail.com";
    private static final String SUBJECT = "Hello World";
    private static final String CONTENT = "First email with JavaMailAPI.";

    public static void main(String[] args) {
        try {
            new SendEmail().send();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public void send() throws MessagingException {

        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtps.auth", "true");

        // Inicjalizacja sesji
        Session mailSession = Session.getDefaultInstance(props);

        // ustawienie debagowania, jeśli nie chcesz oglądać logów to usuń
        // linijkę poniżej lub zmień wartość na false
        mailSession.setDebug(true);

        // Tworzenie wiadomości email
        MimeMessage message = new MimeMessage(mailSession);
        message.setSubject(SUBJECT);
        message.setContent(CONTENT, "text/plain; charset=ISO-8859-2");
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(TO));

        Transport transport = mailSession.getTransport();
        transport.connect(HOST, PORT, FROM, PASSWORD);

        // wysłanie wiadomości
        transport.sendMessage(message, message
                .getRecipients(Message.RecipientType.TO));
        transport.close();
    }
}
