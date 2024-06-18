package src2.PATTERNS.singleton;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailSenderService {


    private String addressSMTP;   // smtp.mail.ru
    private String login;                                   //mYu2RCuR6t$s    //6Pp2xaceETZ57gM9hkx8
    private String password;                                     //genia-genius-91@mail.ru

    private Properties props;


    public MailSenderService(String addressSMTP, String login, String password) {
        this.addressSMTP = addressSMTP;
        this.login = login;
        this.password = password;

        props = new Properties();
        props.put("mail.smtp.host", addressSMTP);
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.enable", "true"); //Вот тут надо было эту строку добавить
    }




    public boolean send(Mail mail) {

        Session session = Session.getDefaultInstance(props,

                new javax.mail.Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(login,password);
            }
        });

        //compose the message
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(login));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(mail.getRecipient()));
            message.setSubject(mail.getTitle());
            message.setText(mail.getBody());

            // Send message
            Transport.send(message);
            return true;
        }catch (MessagingException mex) {
            mex.printStackTrace();
            return false;
        }
    }

}
