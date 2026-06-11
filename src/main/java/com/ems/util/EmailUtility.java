package com.ems.util;

import java.util.Properties;

import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;

import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailUtility {

    public static void sendEmail(String toEmail) {

        final String fromEmail =
        "hayatinsha19@gmail.com";

        final String password =
        "pcnwasfwsxxpclil";

        Properties properties = new Properties();

        properties.put(
        "mail.smtp.host",
        "smtp.gmail.com");

        properties.put(
        "mail.smtp.port",
        "587");

        properties.put(
        "mail.smtp.auth",
        "true");

        properties.put(
        "mail.smtp.starttls.enable",
        "true");

        Session session = Session.getInstance(
        properties,

        new jakarta.mail.Authenticator() {

            protected PasswordAuthentication
            getPasswordAuthentication() {

                return new PasswordAuthentication(
                fromEmail,
                password);
            }
        });

        try {

            Message message =
            new MimeMessage(session);

            message.setFrom(
            new InternetAddress(fromEmail));

            message.setRecipients(
            Message.RecipientType.TO,

            InternetAddress.parse(toEmail));

            message.setSubject(
            "Employee Added Successfully");

            message.setText(
            "Employee added successfully in Employee Management System.");

            Transport.send(message);

            System.out.println(
            "Email Sent Successfully");

        } catch(Exception e) {

            e.printStackTrace();
        }
    }
}