package PATTERNS.singleton;

public class Main1 {
    public static void main(String[] args) {
//        MailSenderService senderService = new MailSenderService(
//                "smtp.mail.ru",
//                "genia-genius-91@mail.ru",
//                "6Pp2xaceETZ57gM9hkx8"
//        );
//
        Mail mail = new Mail("kentuchi1991@mail.ru", "test", "2 варик");
//        senderService.send(mail);
       // MailSenderService senderService = MailSenderService.getInstance();
       MailSenderService senderService = Singleton.getMailSenderService();
        senderService.send(mail);
    }
}
