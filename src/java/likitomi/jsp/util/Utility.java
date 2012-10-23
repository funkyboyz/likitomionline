package likitomi.jsp.util;

// @author funkyboyz_book4

import javax.mail.MessagingException;

public class Utility {

    private static final String CODE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "abcdefghijklmnopqrstuvwxyz"
            + "0123456789";

    private Utility() {
    }

    public static String randomText(int length) {
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int pos = (int) (Math.random() * CODE.length());
            char c = CODE.charAt(pos);
            text.append(c);
        }
        return text.toString();
    }

    public static void sendMail(String from, String to, String subject, String body) {
        sendMail(from, to, "", "", subject, body);
//        sendMail(from, to, subject, body);
    }

    public static void sendMail(String from, String to, String cc, String bcc, String subject, String body) {
        try {
            Email email = new Email();
            HtmlMessage msg = new HtmlMessage();

            msg.addHtml(body);
            email.setFromAddress(from);
            email.setToAddress(to);
            email.setSubject(subject);
            email.send(msg);
        } catch (MessagingException ex) {
            ex.toString();
            throw new RuntimeException(ex.getMessage());
        }
    }

    public static boolean isNumber(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
