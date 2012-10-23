package likitomi.jsp.util;

// @author funkyboyz_book4

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

public class HtmlMessage {
    private MimeMultipart multipart;
    
    public HtmlMessage() {
        multipart = new MimeMultipart("related");
    }
    
    public MimeMultipart getMultipart() {
        return multipart;
    }
    
    public void addHtml(String htmlText) throws MessagingException {
        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(htmlText, "text/html; charset=utf-8");
        multipart.addBodyPart(messageBodyPart);
    }
    
    public void addImage(String fileName, String embeddedName) throws MessagingException {
        BodyPart messageBodyPart = new MimeBodyPart();
        DataSource fds = new FileDataSource(fileName);
        
        messageBodyPart.setDataHandler(new DataHandler(fds));
        messageBodyPart.setHeader("Content-ID", "<" + embeddedName + ">");
        multipart.addBodyPart(messageBodyPart);
    }
}
