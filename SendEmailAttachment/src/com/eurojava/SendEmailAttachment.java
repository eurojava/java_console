/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.FileDataSource;
import javax.activation.DataHandler;

import java.util.Properties;

/**
 *
 * @author Darek
 */
public class SendEmailAttachment {

    private static final String HOST = "smtp.gmail.com";
    private static final int PORT = 465;
    private static final String FROM = "xxxx@gmail.com";
    private static final String PASSWORD = "xxx";
    private static final String TO = "yyyy@gmail.com";
    private static final String SUBJECT = "Hello World";
    private static final String CONTENT = "Email with <i>attachment</i> sent via <b>JavaMailAPI</b>.";
    // !!! Path to file !!!
    private static final String PATH_FILE = "file.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            new SendEmailAttachment().send();
            System.out.println("Email has been sent!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    void send() throws MessagingException {

        Properties props = new Properties();
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtps.auth", "true");

        // get session
        Session mailSession = Session.getDefaultInstance(props, null);

        // create message
        MimeMessage message = new MimeMessage(mailSession);
        message.setSubject(SUBJECT);

        // create cont. & attach.
        MimeBodyPart textPart = new MimeBodyPart();
        textPart.setContent(CONTENT, "text/html; charset=ISO-8859-2");

        // create part with attach.
        MimeBodyPart attachFilePart = new MimeBodyPart();
        FileDataSource fds = new FileDataSource(PATH_FILE);
        attachFilePart.setDataHandler(new DataHandler(fds));
        attachFilePart.setFileName(fds.getName());

        // fusion everything 
        Multipart mp = new MimeMultipart();
        mp.addBodyPart(textPart);
        mp.addBodyPart(attachFilePart);

        // add message content
        message.setContent(mp);
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(TO));

        Transport transport = mailSession.getTransport();
        transport.connect(HOST, PORT, FROM, PASSWORD);

        // send email
        transport.sendMessage(message, message
                .getRecipients(Message.RecipientType.TO));
        transport.close();
    }
}
